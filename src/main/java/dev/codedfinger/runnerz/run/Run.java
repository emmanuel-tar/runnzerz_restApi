package dev.codedfinger.runnerz.run;

public record Run(Integer id,
                  String title,
                  java.time.LocalDateTime startedOn,
                  java.time.LocalDateTime completedOn,
                  Integer miles,
                  Location location
                  ) {
}
