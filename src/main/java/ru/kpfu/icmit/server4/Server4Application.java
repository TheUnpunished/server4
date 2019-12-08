package ru.kpfu.icmit.server4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("ru.kpfu.icmit.server4.repository")
public class Server4Application {

	public static void main(String[] args) {
		SpringApplication.run(Server4Application.class, args);
	}

}
