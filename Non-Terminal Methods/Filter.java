package NonTerminalMethods;
import java.util.*;

class Filter
{
    public static void main(String args[])
    {
        //Creating a list
        List<String> names = Arrays.asList("Alex", "Harsh", "Raj", "John", "Rishabh");
        List<String> ans;


        //Names starting with 'R'
        ans = names
                .stream()
                .filter((name) -> name.startsWith("R"))
                .toList();

        System.out.println(ans);


        //Names ending with 'h'
        ans = names
                .stream()
                .filter((name) -> name.endsWith("h"))
                .toList();

        System.out.println(ans);
    }
}