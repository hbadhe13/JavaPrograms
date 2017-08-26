package Thread;

/**
 * Created by Hemant Badhe on 25-08-2017.
 */
public class SleepDemo extends Thread {
    public  void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Thread "+Thread.currentThread().getName()+" = i");
        }
//        try {
//            System.out.println("Before Sleep....");
//            Thread.sleep(200);
//            System.out.println("After Sleep.....");
//        }
//        catch( InterruptedException e){
//            System.out.println(e);
//        }
    }

    public static void main(String[] args) {
        SleepDemo sd1 = new SleepDemo();
        sd1.run();
    }
}
