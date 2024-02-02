import java.util.*;
import java.util.stream.*;

public class Mobile
{
    String name;
    int price;
    String processor;
    int ram;


    Mobile(String name, int price, String processor, int ram)
    {
        this.name = name;
        this.price = price;
        this.processor = processor;
        this.ram = ram;
    }
}


class ToArray
{
    public static void main(String args[])
    {
        List<Mobile> mobiles = new ArrayList<>();
        mobiles.add(new Mobile("iPhoneX", 100000, "x86", 8));
        mobiles.add(new Mobile("Xiaomi", 30000, "x32", 4));
        mobiles.add(new Mobile("Lava", 35000, "x32", 6));
        mobiles.add(new Mobile("Samsung", 60000, "x86", 8));
        mobiles.add(new Mobile("One Plus", 40000, "x64", 6));

        Stream<Mobile> ans = mobiles
                .stream()
                .sorted((x, y) -> x.price >= y.price ? 1 : -1);

        //Printing the mobiles
        Object arr[] = ans.toArray();
        for(Object item : arr)
        {
            //Type casting
            Mobile p = (Mobile)item;

            System.out.println("Name : " + p.name);
            System.out.println("Price : " + p.price);
            System.out.println("Processor : " + p.processor);
            System.out.println("RAM : " + p.ram);
            System.out.println();
        }
    }
}