package NonTerminalMethods;
import java.util.*;

class Limit
{
    public static void main(String args[])
    {
        List<String> vehicles = Arrays.asList("car", "bike", "bus", "bike", "car");

        List<String> ans = vehicles
                .stream()
                .limit(2)
                .toList();

        System.out.println(ans);
    }
}