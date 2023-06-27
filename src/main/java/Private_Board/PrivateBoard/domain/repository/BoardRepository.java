package Private_Board.PrivateBoard.domain.repository;

import Private_Board.PrivateBoard.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
