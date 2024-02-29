package ParallelStream;
import java.util.*;

class ParallelStream
{
    public static void main(String args[])
    {
        //Creating a list
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Data is picked up one by one
        System.out.println("Sequential Stream :");
        list.stream().forEach((item) -> System.out.print(item + " "));

        System.out.println("\n");

        //Data is picked up parallely
        System.out.println("Parallel Stream :");
        list.parallelStream().forEach((item) -> System.out.print(item + " "));
    }
}