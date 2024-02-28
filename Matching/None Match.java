package Matching;
import java.util.*;

class NoneMatch
{
    public static void main(String args[])
    {
        //Creating a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //Do all elements satisfy the condition
        boolean ans = numbers
                .stream()
                .noneMatch((num) -> num > 5);

        System.out.println(ans);
    }
}