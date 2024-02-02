package NonTerminalMethods;
import java.util.*;

class Distinct
{
    public static void main(String args[])
    {
        List<String> vehicles = Arrays.asList("car", "bike", "bus", "bike", "car");

        List<String> ans = vehicles
                .stream()
                .distinct()
                .toList();

        System.out.println(ans);
    }
}