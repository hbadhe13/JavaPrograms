/**
 * Created by Hemant Badhe on 22-07-2017.
 */
public class Parent {
    Parent()
    {
        public void print()
        {
            System.out.println("Print");
        }
    }
    class Child extends Parent
    {
        Child()
        {
            void print()
            {
                System.out.println("Child");
            }
        }

    }
    class HumanApp
    {

    }
}
