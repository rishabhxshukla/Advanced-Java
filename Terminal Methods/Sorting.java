import java.util.*;

class Sorting
{
    public static void main(String args[])
    {
        //Creating a list
        List<Integer> numbers = Arrays.asList(5, 2, 1, 4, 3);
        List<Integer> ans;

        //Ascending order
        ans = numbers
                .stream()
                .sorted()
                .toList();

        System.out.println(ans);

        //Descending order
        ans = numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(ans);
    }
}