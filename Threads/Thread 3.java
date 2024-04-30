package Threads;

class Thread3
{
    public static void main(String args[])
    {
        Thread t1 = new Thread(() -> {
            for (int i=1; i<=5; i++)
            {
                System.out.println(i);

                try {
                    Thread.sleep(3000);
                }
                catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i=6; i<=10; i++)
            {
                System.out.println(i);

                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
    }
}