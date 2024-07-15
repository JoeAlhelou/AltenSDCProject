package ProjetAlten.ProjetAlten;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AltenSDCApplication {
	public static void main(String... args) {
		SpringApplication app = new SpringApplication(AltenSDCApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port","8085"));
		app.run(args);
	}
}