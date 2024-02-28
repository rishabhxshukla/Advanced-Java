import java.util.*;

class AllMatch
{
    public static void main(String args[])
    {
        //Creating a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //Do all elements satisfy the condition
        boolean ans = numbers
                .stream()
                .allMatch((num) -> num > 0);

        System.out.println(ans);
    }
}