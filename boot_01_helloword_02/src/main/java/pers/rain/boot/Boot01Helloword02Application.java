package pers.rain.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "pers.rain.bean")
public class Boot01Helloword02Application {

	public static void main(String[] args) {
		SpringApplication.run(Boot01Helloword02Application.class, args);
	}

}
