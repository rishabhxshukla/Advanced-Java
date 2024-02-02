package TerminalMethods;
import java.util.*;

class Min
{
    public static void main(String args[])
    {
        List<Integer> vehicles = Arrays.asList(3, 1, 5, 2, 4);

        int ans = vehicles
                .stream()
                .min((x, y) -> x.compareTo(y))
                .get();

        System.out.println(ans);
    }
}