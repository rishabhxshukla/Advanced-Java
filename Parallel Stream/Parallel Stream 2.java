package ParallelStream;
import java.util.*;

class Student
{
    String name;
    int score;

    Student(String name, int score)
    {
        this.name = name;
        this.score = score;
    }
}


class ParallelStream2
{
    public static void main(String args[])
    {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 88));
        students.add(new Student("Willey", 79));
        students.add(new Student("Caleb", 65));
        students.add(new Student("Tiffany", 50));
        students.add(new Student("Caroline", 70));
        students.add(new Student("Jenny", 83));
        students.add(new Student("Rishabh", 97));


        //Data is picked up one by one
        System.out.println("Sequential Stream :");
        students
                .stream()
                .filter((stu) -> (stu.score > 75))
                .limit(3)
                .forEach((stu) -> System.out.println(stu.name + ", " + stu.score));

        System.out.println("\n");

        //Data is picked up parallely
        System.out.println("Parallel Stream :");
        students
                .parallelStream()
                .filter((stu) -> (stu.score > 75))
                .limit(3)
                .forEach((stu) -> System.out.println(stu.name + ", " + stu.score));
    }
}