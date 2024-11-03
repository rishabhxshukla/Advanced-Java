package TerminalMethods;
import java.util.*;

class ToList
{
    public static void main(String args[])
    {
        //Creating a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //Collecting the result in a list
        List<Integer> ans = numbers
                .stream()
                .map((num) -> (num * num))
                .toList();

        System.out.println(ans);
    }
}