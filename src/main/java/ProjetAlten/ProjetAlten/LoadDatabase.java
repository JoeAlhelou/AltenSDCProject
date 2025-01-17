package ProjetAlten.ProjetAlten;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
	 private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	  @Bean
	  CommandLineRunner initDatabase(ProductRepository repository) {

	    return args -> {
	      log.info("Preloading " + repository.save(new Product("code", "name", "description", 5, 10, "inventoryStatus", "category")));
	      log.info("Preloading " + repository.save(new Product("code1", "name1", "description1", 6, 18, "inventoryStatus1", "category1")));
	    };
	  }
}
