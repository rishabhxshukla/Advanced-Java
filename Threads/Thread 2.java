package Threads;

class Thread2 implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("I am Runnable interface!");
    }

    public static void main(String args[])
    {
        Thread2 obj = new Thread2();
        Thread t = new Thread(obj);
        t.start();
    }
}