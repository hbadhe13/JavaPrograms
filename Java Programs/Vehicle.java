/**
 * Created by Hemant Badhe on 20-07-2017.
 */
public class Vehicle {
    String color;
    int tyrecount;

    Vehicle(String color,int tyrecount )
    {
        this.color=color;
        this.tyrecount=tyrecount;
    }
       public void run()
       {
           System.out.println(" vehicle is Running");
       }
}
 class Car extends Vehicle {
    boolean autogear;
     public void run()
     {
         super.run();
     }

     Car(String color, int tyrecount, boolean autogear)
     {
         super(color, tyrecount);
         this.autogear = this.autogear;
     }
      public void CarData()
      {
          System.out.println(" color  ="+ "Black");
          System.out.println("tyrecount ="+4);
          System.out.println("autogear="+);
      }

 }
