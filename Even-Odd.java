import java.util.*;
import java.util.stream.*;

class EvenOdd
{
    //Creating a list
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


    /* Separating even-odd numbers without stream */
    void withoutStream()
    {
        //Array Lists to store the answer
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        //Iterating over list to find even and odd numbers
        numbers.forEach((num) -> {

            if (num % 2 == 0) {
                even.add(num);
            }
            else {
                odd.add(num);
            }
        });

        //Printing the even and odd numbers
        System.out.println(even);
        System.out.println(odd);
    }


    /* Separating even-odd numbers with stream */
    void withStream()
    {
        //Creating a stream
        Stream<Integer> stream1 = numbers.stream();
        Stream<Integer> stream2 = numbers.stream();

        //Iterating over stream twice to find even and odd numbers
        List<Integer> even = stream1
                .filter((num) -> (num % 2 == 0))
                .toList();

        List<Integer> odd = stream2
                .filter((num) -> (num % 2 != 0))
                .toList();

        //Printing the even and odd numbers
        System.out.println(even);
        System.out.println(odd);
    }


    public static void main(String args[])
    {
        EvenOdd obj = new EvenOdd();

        System.out.println("Without using stream :");
        obj.withoutStream();

        System.out.println();

        System.out.println("Using stream :");
        obj.withStream();
    }
}