import java.util.stream.*;

class ParallelStream
{
    public static void main(String args[])
    {
        //Data is picked up one by one
        System.out.println("Sequential Stream :");
        IntStream is = IntStream.rangeClosed(1, 10);
        is.forEach((item) -> System.out.print(item + " "));

        System.out.println("\n");

        //Data is picked up parallely
        System.out.println("Parallel Stream :");
        IntStream ps = IntStream.rangeClosed(1, 10);
        ps.parallel().forEach((item) -> System.out.print(item + " "));
    }
}