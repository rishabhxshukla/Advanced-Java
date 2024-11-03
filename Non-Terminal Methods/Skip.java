package NonTerminalMethods;
import java.util.*;

class Skip
{
    public static void main(String args[])
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .skip(2)
                .forEach(System.out::println);
    }
}