import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2025-07-03");
        LocalDateTime d02 = LocalDateTime.parse("2025-07-03T21:35:30");
        Instant d03 = Instant.parse("2025-07-03T21:35:30Z");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));

        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d01 dia = " + d01.getDayOfMonth());
        System.out.println("d01 mes = " + d01.getMonthValue());
        System.out.println("d01 ano = " + d01.getYear());

        System.out.println("d05 hora = " + d02.getHour());
        System.out.println("d05 minutos = " + d02.getMinute());
    }
}