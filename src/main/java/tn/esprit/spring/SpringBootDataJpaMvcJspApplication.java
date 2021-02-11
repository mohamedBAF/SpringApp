package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBootDataJpaMvcJspApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaMvcJspApplication.class, args);
	}
}
