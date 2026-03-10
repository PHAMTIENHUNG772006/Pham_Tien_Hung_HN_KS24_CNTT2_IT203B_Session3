package dateTime;

import java.time.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(); // trả về theo mili giây

        System.out.println("mili giây : " + date.getTime());
        System.out.println(date);


//        DateTimeAPI

        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(today);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(zonedDateTime);


        LocalDate bornIn = LocalDate.of(2006,07,07);

        Period age = Period.between(bornIn,today);

        System.out.println(age);
    }
}
