package pl.sudoku.response;

import java.util.Arrays;

public record SudokuResponseDTO(
    String status,
    int number,
    int[] gameState
) {
  @Override
  public boolean equals(Object o){
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SudokuResponseDTO sudokuResponseDTO = (SudokuResponseDTO) o;
    return status.equals(sudokuResponseDTO.status) &&
            number == sudokuResponseDTO.number() &&
            Arrays.equals(gameState, sudokuResponseDTO.gameState);
  }
}

//  @Override
//  public int hashCode() {
//    int result = Objects.hash(age);
//    result = 31 * result + Arrays.hashCode(names);
//    return result;
//  }
//
//  @Override
//  public String toString() {
//    return "Person{" +
//        "names=" + Arrays.toString(names) +
//        ", age=" + age +
//        '}';
//  }