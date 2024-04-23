import java.time.*;

class Date
{
    public static void main(String args[])
    {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        date = LocalDate.of(2024, Month.APRIL, 23);
        System.out.println(date);

        date = LocalDate.of(2024, 1, 1);
        System.out.println(date);

        date = LocalDate.parse("2020-01-01");
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
    }
}