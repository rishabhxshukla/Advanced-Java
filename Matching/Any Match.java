import java.util.*;

class AnyMatch
{
    public static void main(String args[])
    {
        //Creating a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //Does any one element satisfy the condition
        boolean ans = numbers
                .stream()
                .anyMatch((num) -> num > 3);

        System.out.println(ans);
    }
}