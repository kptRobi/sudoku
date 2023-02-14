package pl.sudoku.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sudoku.response.SudokuResponseDTO;

@Repository
public interface SudokuRepository extends JpaRepository<GameStateEntity, Long> {
  Optional<GameStateEntity> findById(String id);
}
