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

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("d01 = " + d01.format(fmt1));
        System.out.println("d01 = " + fmt1.format(d01));
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));


        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("d02 = " + d02.format(fmt1));
        System.out.println("d02 = " + d02.format(fmt2));


        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d03 = " + fmt3.format(d03));
    }
}