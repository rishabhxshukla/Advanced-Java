/* LocalDateTime can access the methods of both LocalDate and LocalTime */

import java.time.*;

class DateTimeAPI
{
    public static void main(String args[])
    {
        //Creating date-time object
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);


        System.out.println(dt.getYear());
        System.out.println(dt.getMonth());


        System.out.println(dt.getHour());
        System.out.println(dt.getMinute());


        //Converting to local date and local time
        LocalDate date = dt.toLocalDate();
        LocalTime time = dt.toLocalTime();
        System.out.println(date);
        System.out.println(time);


        //Specific date-time
        dt = LocalDateTime.of(2020, 1, 1, 12, 30, 30);
        System.out.println(dt);
    }
}