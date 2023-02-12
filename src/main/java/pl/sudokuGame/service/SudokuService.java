package pl.sudokuGame.service;

import org.springframework.stereotype.Service;
import pl.sudokuGame.response.SudokuResponseDTO;

@Service
public class SudokuService {

public SudokuResponseDTO test(String s){
  try {
    return new SudokuResponseDTO("OK", Integer.parseInt(s));
  }catch (NumberFormatException e){
    return new SudokuResponseDTO("To nie numer kasztanie", 420);
  }
}


}
