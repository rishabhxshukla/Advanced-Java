import java.util.ArrayList;
import java.util.Iterator;

class Students
{
    String name, city;
    Students(String name, String city)
    {
        this.name = name;
        this.city = city;
    }
}


class Collection
{
    public static void main(String args[])
    {
        //Array to store students :
        ArrayList<Students> al = new ArrayList<>();
        al.add(new Students("Alex", "London"));
        al.add(new Students("Peter", "California"));
        al.add(new Students("Smith", "San Diego"));

        //While loop :
        System.out.println("WHILE :");
        Iterator<Students> i = al.iterator();
        while (i.hasNext())
        {
            Students s = i.next();
            System.out.println(STR."\{s.name} : \{s.city}");
        }

        System.out.println();

        //ForEach loop :
        System.out.println("FOR EACH :");
        al.forEach((item) ->
                System.out.println(STR."\{item.name} : \{item.city}")
        );
    }
}