package NonTerminalMethods;
import java.util.*;

class Map
{
    public static void main(String args[])
    {
        //Creating a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //Finding square of each number
        List<Integer> ans = numbers
                .stream()
                .map((num) -> (num * num))
                .toList();

        System.out.println(ans);
    }
}