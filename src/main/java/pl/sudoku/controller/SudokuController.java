package pl.sudoku.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sudoku.response.SudokuResponseDTO;
import pl.sudoku.service.SudokuService;

@RestController
@RequestMapping("/sudoku")
@AllArgsConstructor
public class SudokuController {

  SudokuService sudokuService;

  @RequestMapping("/test")
  public String test(){

    return "WHaj em si ej";
  }

  @RequestMapping("/test/{number}")
  public SudokuResponseDTO test(@PathVariable String number){
    return sudokuService.test(number);
  }

  @GetMapping("/{id}")
  public SudokuResponseDTO getGameState (@PathVariable String id){
    return sudokuService.getGameState(id);
  }
}
