package Mon;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("One");
        ll.add("Two");
        ll.add("Three");
        ll.add("Four");
        ll.add("Five");

        for (int i=0; i<ll.size(); i++){
            System.out.print(ll.get(i)+" ");
        }
        System.out.println();

        for (String s : ll){
            System.out.print( s + " ");
        }
    }
}
