package pl.sudoku.repository;

import static jakarta.persistence.GenerationType.IDENTITY;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GAME_STATES")
public class GameStateEntity {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private String id;
  @Column
  private int[] gameState;

}
