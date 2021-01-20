package enumdemo;


import java.time.*;

public class ZoneLocalDateTime {

    public static void main(String[] args) {
        LocalDate departureDate = LocalDate.parse("2021-01-21");
        LocalTime departureTime = LocalTime.parse("12:00");
        ZoneId departureZone = ZoneId.of("Europe/Riga");
        System.out.println("LocalDate is:" + departureDate);
        System.out.println("LocalTime is:" + departureTime);
        System.out.println("ZoneId is:" + departureZone);
        ZonedDateTime departureDT = ZonedDateTime.of(departureDate, departureTime, departureZone);
        System.out.println("departureDT is:" + departureDT);

        LocalDate arrivalDate = LocalDate.parse("2021-01-21");
        LocalTime arrivalTime = LocalTime.parse("16:00");
        ZoneId arrivalZone = ZoneId.of("Europe/Paris");
        System.out.println("LocalDate is:" + arrivalDate);
        System.out.println("LocalTime is:" + arrivalTime);
        System.out.println("ZoneId is:" + arrivalZone);
        ZonedDateTime arrivalDT = ZonedDateTime.of(arrivalDate, arrivalTime, arrivalZone);
        System.out.println("arrivalDT is:" + arrivalDT);

Duration dur = Duration.between(departureDT, arrivalDT);
        System.out.println("Duration is:" + dur);
int days = durDaysPart();
int hours = dur.toHoursPart();
int minutes = dur.toMinutesPart();


    }

    private static int durDaysPart() {
        return 0;
    }
}
