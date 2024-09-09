package dev.codedfinger.runnerz;

import dev.codedfinger.runnerz.run.Location;
import dev.codedfinger.runnerz.run.Run;
import foo.bar.WelcomeMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class Application {

    // The main method is the entry point for th application
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
        log.info("Something Changed");
    }
@Bean
CommandLineRunner runner() {
        return args -> {
Run run = new Run(1,"First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS),5, Location.OUTDOOR);
log.info("Run"+run);
        };
}
}
