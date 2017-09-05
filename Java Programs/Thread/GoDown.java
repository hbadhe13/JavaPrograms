package Thread;

public class GoDown {
    int currentItemCount;
    public static  final int capacity = 5;

   synchronized public void getItem() throws InterruptedException
    {

        if(currentItemCount == 0)
        {
            wait(3000);
        }
        else
        {
            if(currentItemCount == capacity)
            {
                notify();
            }
            System.out.println("CurrrentItemCount at SellsTeam: "+currentItemCount);
            currentItemCount --;
        }

    }

    synchronized public void pushItem() throws InterruptedException
    {

        if(capacity > currentItemCount)
        {
            if(currentItemCount ==0)
            {
             notify();
            }
            currentItemCount ++;
        }
        else
        {
            wait(3000);
        }
        System.out.println("CurrrentItemCount at Producer: "+currentItemCount);
    }


}

class Producer extends Thread{

    GoDown goDown;

    Producer(GoDown g)
    {
        this.goDown = g;
    }

    public void run()
    {
        for(int i = 0; i<100; i++)
        {
            try
            {
                   goDown.pushItem();

            }catch (InterruptedException e)
            {}
        }
    }
}

class SellsTeam extends Thread {
    GoDown goDown;

    SellsTeam(GoDown g) {
        this.goDown = g;
    }

    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            try
            {
                goDown.getItem();

            }catch (InterruptedException e){}
        }
    }
}

class ProductionApp
{
    public static void main(String[] args)
    {
        GoDown g = new GoDown();
        Producer p = new Producer(g);
        SellsTeam st = new SellsTeam(g);

        p.start();
        st.start();
    }
}



