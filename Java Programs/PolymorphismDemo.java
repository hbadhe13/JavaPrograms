/**
 * Created by Hemant Badhe on 22-07-2017.
 */
class C {
    public void demo(){
        System.out.println("Base class");
    }
}


class A extends C {
    public void demo(){
        System.out.println("derived class 1");
    }
}

class B extends C {
    public void demo(){
        System.out.println("derived class 2");
    }
}

public class PolymorphismDemo{
    public static void main(String[] args) {
        A a = new A();
        B b=new B();
        b.demo();
        a.demo();
    }

}
