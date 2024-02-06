import java.util.*;

class Students2
{
    String name;
    int score;

    Students2(String name, int score)
    {
        this.name = name;
        this.score = score;
    }
}


class ParallelStream2
{
    public static void main(String args[])
    {
        ArrayList<Students2> al = new ArrayList<>();
        al.add(new Students2("Alex", 88));
        al.add(new Students2("Willey", 79));
        al.add(new Students2("Caleb", 65));
        al.add(new Students2("Tiffany", 50));
        al.add(new Students2("Caroline", 70));
        al.add(new Students2("Jenny", 83));
        al.add(new Students2("Rishabh", 97));


        //Data is picked up one by one
        System.out.println("Sequential Stream :");
        al
                .stream()
                .filter((stu) -> (stu.score > 75))
                .limit(3)
                .forEach((stu) -> System.out.println(stu.name + ", " + stu.score));

        System.out.println("\n");

        //Data is picked up parallely
        System.out.println("Parallel Stream :");
        al
                .stream().parallel()
                .filter((stu) -> (stu.score > 75))
                .limit(3)
                .forEach((stu) -> System.out.println(stu.name + ", " + stu.score));
    }
}