package Practice;

interface vehicle
        {
            void ChangeGear(int a);
            void SpeedUp(int a);
            void ApplyBrake(int a);
        }
public class Bicycle implements vehicle {

    int Gear,Speed;
    public void ChangeGear(int newGear)
    {
        Gear = newGear;
    }

    public void SpeedUp(int newSpeed)

    {
        Speed = newSpeed;
    }

    public void ApplyBrake(int brake)

    {
        Speed = Speed-brake;
    }

    public  void print()
    {
        System.out.println("Gear: "+Gear +"Speed: "+Speed);
    }

    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.ChangeGear(5);
        b.SpeedUp(10);
        b.ApplyBrake(2);
        b.print();
    }

}
