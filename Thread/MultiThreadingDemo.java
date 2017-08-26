package Thread;

/**
 * Created by Hemant Badhe on 23-08-2017.
 */
public class MultiThreadingDemo extends Thread {

    public static void main(String[] args) {
        MultiThreadingDemo mt = new MultiThreadingDemo();
        Thread n;
        mt.start();
       n= mt.currentThread();
        System.out.println("Current Thread is: "+n);
    }

    public void run()
    {
        System.out.println("Thread Running.....");
    }
}
