package Mon;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> lan = new HashSet<String>();

        lan.add("Apple");
        lan.add("Banana");
        lan.add("Melon");
        lan.add("Strawberry");
        lan.add("Tomato");
        lan.add("Banana");

        Iterator it = lan.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
