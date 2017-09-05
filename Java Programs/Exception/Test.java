package Exception;
import java.lang.reflect.Method;

public class Test
{
    public static void main(String args[])throws ClassNotFoundException
    {
        int count=0;
        Class student = Class.forName("java.lang.Runnable");
        Method[] m = student.getDeclaredMethods();

        for(Method m1 : m)
        {
            count++;

            System.out.println(m1.getName());
        }
        System.out.println(count);
    }
}
