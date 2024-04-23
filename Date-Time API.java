/* LocalDateTime can access the methods of both LocalDate and LocalTime */

import java.time.*;

class DateTime
{
    public static void main(String args[])
    {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        System.out.println(dt.getYear());
        System.out.println(dt.getMonth());

        System.out.println(dt.getHour());
        System.out.println(dt.getMinute());

        LocalDateTime strToDateTime = LocalDateTime.parse("2024-04-23T11:30:30.120");
        System.out.println(strToDateTime);
    }
}