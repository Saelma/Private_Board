package Private_Board.PrivateBoard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PrivateBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrivateBoardApplication.class, args);
	}

}
