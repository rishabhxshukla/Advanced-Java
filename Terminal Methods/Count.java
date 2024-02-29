package TerminalMethods;
import java.util.*;

class Count
{
    public static void main(String args[])
    {
        List<String> vehicles = Arrays.asList("car", "bike", "bus", "bike", "car");

        //Finding number of elements
        long ans = vehicles
                .stream()
                .count();

        System.out.println(ans);
    }
}