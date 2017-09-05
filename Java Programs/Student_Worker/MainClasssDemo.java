package Student_Worker;

import java.util.TreeSet;

public class MainClasssDemo extends Person {
    public static void main(String[] args) {

        TreeSet  t = new TreeSet();
        t.add(new Student("Hemant",21,"JSPM"));
        t.add(new Student("Akash",22,"JSPM"));
        t.add(new Student("Kiran",24,"GHR"));
        t.add(new Worker("Akshay",29,"TW"));
        t.add(new Worker("Mahesh",33,"TCS"));
        t.add(new Worker("Abhijit",30,"AgroStar"));

        System.out.println(t);

    }
}
