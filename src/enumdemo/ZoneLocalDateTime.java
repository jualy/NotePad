package enumdemo;


import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneLocalDateTime {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2021-01-20");
        System.out.println("LocalDate is:" + localDate);
        ZonedDateTime zoneDateTime = localDate.atStartOfDay(ZoneId.systemDefault());
        System.out.println("ZoneDateTime is:" + zoneDateTime);

    }
}
