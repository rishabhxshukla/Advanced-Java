package NonTerminalMethods;
import java.util.*;

class Peek
{
    public static void main(String args[])
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .peek((num) -> System.out.println("Processing " + num))
                .peek((num) -> System.out.println("Square of " + num + " is :"))
                .map((num) -> num * num)
                .forEach((num) -> System.out.println(num));
    }
}