package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Student {
    String name;
    int rollNo;
    Student(String name, int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class StudentTestDemo implements Comparator
{
    public static void main(String[] args) {
        {
            TreeSet<Student> st = new TreeSet<Student>();
            st.add(new Student("Hemant",03));
            st.add(new Student ("Shubham",10));

            for(Student s : st)
            {
                System.out.println("Name: "+s.name+"Roll No: "+s.rollNo);
            }
        }
    }
}
