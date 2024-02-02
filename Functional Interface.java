/* Functional Interface is an interface with only one abstract method. */
@java.lang.FunctionalInterface
interface Message
{
    void greet(String msg);
}


class Functional_Interface implements Message
{
    @Override
    public void greet(String msg)
    {
        System.out.println(msg);
    }

    public static void main(String args[])
    {
        Functional_Interface obj = new Functional_Interface();
        String msg = "Good morning!";

        obj.greet(msg);
    }
}