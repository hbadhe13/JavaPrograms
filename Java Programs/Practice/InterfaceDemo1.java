package Practice;

/**
 * Created by Hemant Badhe on 24-08-2017.
 */
interface Player
{
    public void move();
   /* {
        System.out.println("In interface...");
    }*/
}
public class InterfaceDemo1 implements Player{

    public void move(){

        System.out.println("In class...");
    }

    public static void main(String[] args) {
        InterfaceDemo1 i = new InterfaceDemo1();
        i.move();
    }

}
