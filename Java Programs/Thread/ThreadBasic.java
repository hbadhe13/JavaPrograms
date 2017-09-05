package Thread;

/**
 * Created by Hemant Badhe on 24-08-2017.
 */
public class ThreadBasic extends Thread {
    public static void main(String[] args) {
        ThreadBasic tb = new ThreadBasic();

        tb.start();
        System.out.println("Running thread: "+tb.currentThread());
        System.out.println("Priority...: "+tb.getPriority());
        System.out.println(tb.getState());
        System.out.println(tb.getStackTrace());

    }
}
