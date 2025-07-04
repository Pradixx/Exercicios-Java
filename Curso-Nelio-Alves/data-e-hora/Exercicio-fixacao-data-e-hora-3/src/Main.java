import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Main {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2025-07-03");
        LocalDateTime d02 = LocalDateTime.parse("2025-07-03T21:35:30");
        Instant d03 = Instant.parse("2025-07-03T21:35:30Z");

        LocalDate semanaPassadaLocalDate = d01.minusDays(7);
        LocalDate proximaSemanaLocalDate = d01.plusDays(7);

        System.out.println("LocalDate: " + semanaPassadaLocalDate);
        System.out.println("LocalDate: " + proximaSemanaLocalDate);


        LocalDateTime semanaPassadaLocalDateTime = d02.minusDays(7);
        LocalDateTime proximaSemanaLocalDateTime = d02.plusDays(7);

        System.out.println("LocalDateTime: " + semanaPassadaLocalDateTime);
        System.out.println("LocalDateTime: " + proximaSemanaLocalDateTime);


        Instant semanaPassadaInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("Instant: " + semanaPassadaInstant);
        System.out.println("Instant: " + proximaSemanaInstant);


        Duration t1 = Duration.between(semanaPassadaLocalDate.atStartOfDay(), d01.atStartOfDay());
        Duration t2 = Duration.between(semanaPassadaLocalDateTime, d02);
        Duration t3 = Duration.between(semanaPassadaInstant, d03);

        System.out.println("t1: " + t1.toDays());
        System.out.println("t2: " + t2.toDays());
        System.out.println("t3: " + t3.toDays());
    }
}