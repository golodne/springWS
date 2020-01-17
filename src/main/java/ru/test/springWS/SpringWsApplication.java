package ru.test.springWS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "ru.test")
public class SpringWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWsApplication.class, args);
	}

}
