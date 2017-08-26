package Thread;

/**
 * Created by Hemant Badhe on 24-08-2017.
 */
public class ThreadDemo extends Thread {
   public void print() {
        for (int a = 0; a < 10; a++) {
            Thread t = Thread.currentThread();
            System.out.println("\nIteration: "+a);
            System.out.println("Thread" + t.getId() + "Running: " + a);
            System.out.println("Priority before= " + t.getPriority());
            t.setPriority(Thread.MAX_PRIORITY);
            System.out.println("Priority alter= " + t.getPriority());
        }

    }
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            ThreadDemo t = new ThreadDemo();
            t.start();
        }
        ThreadDemo td = new ThreadDemo();
        td.print();
    }
}
