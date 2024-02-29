package TerminalMethods;
import java.util.*;

class ForEach
{
    public static void main(String args[])
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //Printing all the elements
        numbers
                .stream()
                .forEach(System.out::println);
    }
}