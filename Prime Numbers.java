import java.util.ArrayList;

class PrimeNumbers
{
    ArrayList<Integer> al = new ArrayList<>();

    void create()
    {
        for (int i=2; i<=10; i++)
        {
            al.add(i);
        }
    }

    void printPrime()
    {
        al.forEach((item) -> {

            int count = 0;

            for (int i=2; i<10; i++)
            {
                if (item % (i) == 0)
                {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(item + " ");
            }
        });
    }

    public static void main(String args[])
    {
        PrimeNumbers obj = new PrimeNumbers();

        //Creating array list
        obj.create();
        //Printing prime numbers
        obj.printPrime();
    }
}