import java.time.*;

class Time
{
    public static void main(String args[])
    {
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

        ZoneId zone = ZoneId.of("Canada/Central");
        LocalTime zoneTime = LocalTime.now(zone);
        System.out.println(zoneTime);
    }
}