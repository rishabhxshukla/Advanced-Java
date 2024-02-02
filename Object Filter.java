import java.util.*;

class Product
{
    int id;
    String name;
    double price;


    Product(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}


class ObjectFilter
{
    public static void main(String args[])
    {
        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "Lenovo", 1299.0));
        products.add(new Product(102, "HP", 1620.57));
        products.add(new Product(103, "MSI", 699.0));
        products.add(new Product(104, "Dell", 1120.45));
        products.add(new Product(105, "Apple", 1999.0));


        System.out.println("Items where price > 1200 :\n");
        products
                .stream()
                .filter((item) -> item.price > 1200)
                .forEach((item) -> System.out.println(
                        STR."\{item.id} : \{item.name} : \{item.price}"
                ));
    }
}