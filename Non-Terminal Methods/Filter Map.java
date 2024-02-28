package NonTerminalMethods;
import java.util.*;

class Employee
{
    int id;
    String name;
    int salary;


    Employee(int id, String name, int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}


class FilterMap
{
    public static void main(String args[])
    {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Rishabh", 30000));
        employees.add(new Employee(102, "Alex", 25000));
        employees.add(new Employee(103, "Peter", 15000));
        employees.add(new Employee(104, "Tiffany", 22000));
        employees.add(new Employee(105, "Caroline", 40000));


        System.out.println("Salaries > 25000 :\n");

        List<Integer> ans = employees
                .stream()
                .filter((item) -> item.salary > 25000)
                .map((emp) -> emp.salary)
                .toList();

        System.out.println(ans);
    }
}