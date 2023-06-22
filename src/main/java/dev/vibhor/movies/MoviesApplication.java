package dev.vibhor.movies;


import org.springframework.boot.SpringApplication;
//annotations in java let the compiler know what a class does
//tomcat is a webserver
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args)	 {
		SpringApplication.run(MoviesApplication.class, args);
	}


}
