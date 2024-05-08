package DateTimeAPI;
import java.time.*;

class LocalDateAPI
{
    public static void main(String args[])
    {
        //Creating date object
        LocalDate date = LocalDate.now();
        System.out.println(date);


        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());
        System.out.println(date.getEra());


        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.isLeapYear());


        System.out.println(date.minusDays(7));
        System.out.println(date.plusDays(7));

        System.out.println(date.minusWeeks(4));
        System.out.println(date.plusWeeks(4));

        System.out.println(date.minusMonths(3));
        System.out.println(date.plusMonths(3));

        System.out.println(date.minusYears(3));
        System.out.println(date.plusYears(3));


        //Epoch Date (Start date)
        date = LocalDate.ofEpochDay(0);
        System.out.println(date);


        //Specific date
        System.out.println("Specific dates :");
        date = LocalDate.of(2020, Month.JANUARY, 1);
        System.out.println(date);
        date = LocalDate.of(2020, 1, 1);
        System.out.println(date);
        date = LocalDate.parse("2020-01-01");
        System.out.println(date);


        //Converting to local date-time
        LocalDate d = LocalDate.now();
        LocalDateTime dt = d.atTime(LocalTime.now());
        System.out.println(dt);
    }
}