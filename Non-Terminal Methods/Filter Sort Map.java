package NonTerminalMethods;
import java.util.*;

class FilterSortMap
{
    public static void main(String args[])
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers
                .stream()
                .filter(num -> num % 2 == 0)
                .sorted()
                .map(num -> num * num)
                .forEach(System.out::println);
    }
}