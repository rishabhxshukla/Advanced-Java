package DateTimeAPI;
import java.time.*;

class LocalTimeAPI
{
    public static void main(String args[])
    {
        //Creating time object
        LocalTime time = LocalTime.now();
        System.out.println(time);


        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());


        System.out.println(time.minusHours(3));
        System.out.println(time.minusMinutes(30));
        System.out.println(time.minusSeconds(30));

        System.out.println(time.plusHours(3));
        System.out.println(time.plusMinutes(30));
        System.out.println(time.plusSeconds(30));


        //Specific time
        time = LocalTime.of(12, 30, 30);
        System.out.println(time);


        /* Get all the Zone Ids */
        /*
        Set<String> ids = ZoneId.getAvailableZoneIds();
        ids.stream().sorted().forEach(System.out::println);
        */

        //Time in NYC
        LocalTime zoneTime = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(zoneTime);


        //Converting to local date-time
        LocalTime t = LocalTime.now();
        LocalDateTime dt = t.atDate(LocalDate.now());
        System.out.println(dt);
    }
}