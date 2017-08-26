package Thread;

/**
 * Created by Hemant Badhe on 23-08-2017.
 */
public class MultiThreading implements Runnable{

    public static void main(String[] args) {

        MultiThreading mt = new MultiThreading();

        Thread t = new Thread(mt);
        t.start();
    }

    public void run()
    {
        System.out.println("Thread Running.....");
    }

}

