package Thread;

/**
 * Created by Hemant Badhe on 24-08-2017.
 */
public class ThreadImplement implements Runnable{
    public void run()
        {
                System.out.println ("Thread "+Thread.currentThread().getId()+" is running.");
        }

        public static void main(String[] args)
        {
            int n = 8;
            for (int i=0; i<8; i++)
            {
                Thread t = new Thread(new ThreadImplement());
                t.start();
            }
        }
    }
