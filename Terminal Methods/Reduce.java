package TerminalMethods;
import java.util.*;

class Reduce
{
    public static void main(String args[])
    {
        List<Integer> grades = Arrays.asList(1, 2, 3, 4, 5);

        //Finding sum of all grades
        int ans = grades
                .stream()
                .reduce((x, y) -> (x + y))
                .get();

        System.out.println(ans);
    }
}