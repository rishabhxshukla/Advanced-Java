package SequentialStream;
import java.util.*;
import java.util.stream.*;

class Stream1
{
    public static void main(String args[])
    {
        //Creating a list
        List<Integer> list = Arrays.asList(1, 2, 3, 1, 5, 4, 3, 2, 5, 4);

        //Printing original array
        System.out.println("Original Array :");
        System.out.println(list);

        //Creating a stream
        Stream<Integer> s = list.stream();

        //Performing operations on stream
        s = s.distinct().sorted();

        System.out.println();

        //Printing array after operations
        System.out.println("After Operations :");
        s.forEach((item) -> System.out.print(item + " "));
    }
}