package dictionary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DictionaryApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DictionaryApplication.class, args);

		SpringApplicationBuilder builder = new SpringApplicationBuilder(DictionaryApplication.class);
		builder.headless(false);
		ConfigurableApplicationContext context = builder.run(args);
	}
}
