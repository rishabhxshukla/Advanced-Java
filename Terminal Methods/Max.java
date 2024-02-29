package TerminalMethods;
import java.util.*;

class Max
{
    public static void main(String args[])
    {
        List<Integer> vehicles = Arrays.asList(3, 1, 5, 2, 4);

        //Finding max element
        int ans = vehicles
                .stream()
                .max((x, y) -> x.compareTo(y))
                .get();

        System.out.println(ans);
    }
}