package pl.sudoku.service;

import java.util.Optional;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pl.sudoku.repository.GameStateEntity;
import pl.sudoku.repository.SudokuRepository;
import pl.sudoku.response.SudokuResponseDTO;

@Service
@AllArgsConstructor
public class SudokuService {
  ModelMapper modelMapper;
  SudokuRepository sudokuRepository;

public SudokuResponseDTO test(String s){
  try {
    return new SudokuResponseDTO("OK", Integer.parseInt(s), null);
  }catch (NumberFormatException e){
    return new SudokuResponseDTO("To nie numer kasztanie", 420, null);
  }
}

public SudokuResponseDTO getGameState(String id){
  Optional<GameStateEntity> o = sudokuRepository.findById(id);
  if(o.isPresent()){
    SudokuResponseDTO sudokuResponseDTO = modelMapper.map(o, SudokuResponseDTO.class);
    return sudokuResponseDTO;
  }else{
    return new SudokuResponseDTO("failed", 12, null);
  }
}

}
