

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeCreate {
    private static LocalDateTime ZoneLocalDateTime;

    public static void main(String[] args) {
        var currentDate = LocalDate.now();
        System.out.println("current date: " + currentDate);

        var currentTime = LocalTime.now();
        System.out.println("current time: " + currentTime);

        var currentDateTime = LocalDateTime.now();
        System.out.println("current date/time:" + currentDateTime);

        var currentZoneDateTime = ZoneLocalDateTime.now();
        System.out.println("current zone/date/time:" + currentZoneDateTime);


        var myBirthday = LocalDate.of(1978, Month.APRIL, 4);
        System.out.println("my birthday 1: " + myBirthday);

        var myBirthday2 = LocalDate.of(1978, 4, 4);
        System.out.println("my birthday 2: " + myBirthday);

        var lessonStartTime = LocalTime.of(18, 30, 0);
        System.out.println("lesson start time: " + lessonStartTime);

        var firstLessonStart = LocalDateTime.of(2020, 11, 23, 18, 30);
        System.out.println("first lesson start: " + firstLessonStart);


        var dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        var strDate = "07.01.2021";
        var date = LocalDate.parse(strDate, dateFormatter);
        System.out.println("date: " + date);

        var datetimeFormatter = DateTimeFormatter.ofPattern("dd MMM uuuu @ HH:mm");
        var dt = LocalDateTime.of(currentDate, lessonStartTime);
        var strDT = datetimeFormatter.format(dt);
        System.out.println("dt: " + strDT);

        var dt1 = currentDate.atTime(lessonStartTime);
        System.out.println("dt1: " + dt1);
        var dt2 = dt1.plusMinutes(98760);
        System.out.println("dt1: " + dt1);
        System.out.println("dt2: " + dt2);

//var locDTF = DateTimeFormatter
    }

}
