package Thread;

/**
 * Created by Hemant Badhe on 24-08-2017.
 */
public class Thread1 implements Runnable {

    public void run()
    {
        System.out.println("Running Thread: "+Thread.currentThread().getId());

    }

    public static void main(String[] args) {
        for(int i = 0;i<5;i++) {
            Thread t = new Thread(new Thread1());
            t.start();

        }
    }
}
