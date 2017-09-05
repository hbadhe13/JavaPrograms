/**
 * Created by Hemant Badhe on 19-07-2017.
 */
import java.util.*;
public class Student {
    private Student()
    {
        String name;
        int RollNmber;
    }

    public hello(String name) {
        {
            this.name = name;
        }

        {
            System.out.println("\n Hello" + name);
        }

    }

    class StudentApp
    {
        public static void main(String args[])
        {
            Student s=new Student();
            s.hello();
        }
    }
}
