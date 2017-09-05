package Collection.Linked_List;

import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList <Student>ll = new LinkedList<Student>();
        ll.add(new Student("Hemant",03));
        ll.add(new Student("Kiran",06));
        ll.add(new Student("Nana",12));

        Iterator e = ll.iterator();
        while(e.hasNext()){
            Student student = (Student)e.next();
            System.out.println("Student Name: "+student.name+"\t\t"+"Roll No: "+student.RollNo);
        }
    }
}
