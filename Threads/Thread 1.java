package Threads;

class Thread1 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("My first thread!");
    }

    public static void main(String args[])
    {
        Thread1 obj = new Thread1();
        obj.run();
    }
}