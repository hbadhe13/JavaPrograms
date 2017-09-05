package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();

        hs.add(1);
        hs.add(2);
        hs.add("A");
        hs.add(4);

        Iterator e = hs.iterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }
    }
}
