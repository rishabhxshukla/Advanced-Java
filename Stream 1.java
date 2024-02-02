import java.util.stream.*;
import java.util.ArrayList;

class MyStream1
{
    public static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(1);
        al.add(5);
        al.add(4);
        al.add(2);
        al.add(1);

        //Printing original array
        System.out.println("Original Array :");
        System.out.println(al);

        //Creating a stream
        Stream<Integer> s = al.stream();

        //Performing operations on stream
        s = s.distinct().sorted();

        //Printing array after operations
        System.out.println("After Operations :");
        s.forEach((item) -> {
            System.out.print(item + " ");
        });
    }
}