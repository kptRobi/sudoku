package pl.sudokuGame.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sudokuGame.response.SudokuResponseDTO;
import pl.sudokuGame.service.SudokuService;

@RestController
@RequestMapping("/sudoku")
public class SudokuController {

  public SudokuService sudokuService = new SudokuService();

  @RequestMapping("/test")
  public String test(){

    return "WHaj em si ej";
  }

  @RequestMapping("/test/{number}")
  public SudokuResponseDTO test(@PathVariable String number){
    return sudokuService.test(number);
  }
}
