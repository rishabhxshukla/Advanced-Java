package SequentialStream;
import java.util.*;

class Stream2
{
    public static void main(String args[])
    {
        //Creating a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //Printing original array
        System.out.println("Original Array :");
        System.out.println(numbers);

        //Performing operations
        List<Integer> square = numbers
                .stream()
                .map((item) -> (item * item))
                .toList();

        System.out.println();

        //Printing array after operations
        System.out.println("After Operations :");
        System.out.println(square);
    }
}