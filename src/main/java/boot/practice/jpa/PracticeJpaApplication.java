package boot.practice.jpa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@Slf4j
@SpringBootApplication//(exclude={DataSourceAutoConfiguration.class})
public class PracticeJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeJpaApplication.class, args);
		log.info("########## !!!!!!!!!!!! Application started !!!!!! ############");

	}

}
