package TerminalMethods;
import java.util.*;

class ToArray
{
    public static void main(String args[])
    {
        List<Integer> vehicles = Arrays.asList(3, 1, 5, 2, 4);

        //Converting list to array
        Object ans[] = vehicles.toArray();

        //Printing the array
        System.out.println(Arrays.toString(ans));
    }
}