import java.util.*;
import java.util.stream.*;

class ArrayToStream
{
    public static void main(String args[])
    {
        //Converting string array to list
        String names1[] = {"Alex", "Peter", "John", "Smith", "Jenna"};
        List<String> list = Stream.of(names1).toList();


        //Creating stream from string
        String names2[] = {"Alex", "Peter", "John", "Smith", "Jenna"};
        Stream<String> s1 = Stream.of(names2);
        s1.forEach((name) -> {
            System.out.print(name + " ");
        });


        System.out.println();


        //Empty stream
        Stream<Objects> emptystream = Stream.empty();
        emptystream.forEach((item) -> {
            System.out.println(item);
        });


        System.out.println();


        //Creating stream from integer array
        int arr1[] = {1, 2, 3, 4, 5};
        IntStream s2 = Arrays.stream(arr1);
        s2.forEach((item) -> {
            System.out.print(item + " ");
        });


        System.out.println();
        System.out.println();


        //Creating stream from string array
        String arr2[] = {"CSE", "ECE", "ME", "EE", "CE"};
        Stream<String> s3 = Arrays.stream(arr2);
        s3.forEach((item) -> {
            System.out.print(item + " ");
        });
    }
}