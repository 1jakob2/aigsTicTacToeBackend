package ch.fhnw.richards.aigs_spring_server.utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch.fhnw.richards.aigs_spring_server.user.User;
import ch.fhnw.richards.aigs_spring_server.user.UserRepository;
@Configuration
public class Initializer {
	private static final Logger log = LoggerFactory.getLogger(Initializer.class);

	@Bean
	CommandLineRunner initDatabase(UserRepository ur) {

		return args -> {
			User brad = new User("Brad", "$2a$10$abcdefghijklmaopqestquDMArJwpYyWXAilNvrBFi5A.bI6UPTP.");
			log.info("Preloading " + ur.save(brad));
		};
		
	}
}
