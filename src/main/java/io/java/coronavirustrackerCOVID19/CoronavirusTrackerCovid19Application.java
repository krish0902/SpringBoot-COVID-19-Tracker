package io.java.coronavirustrackerCOVID19;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronavirusTrackerCovid19Application {

	public static void main(String[] args) {
		SpringApplication.run(CoronavirusTrackerCovid19Application.class, args);
	}

}
