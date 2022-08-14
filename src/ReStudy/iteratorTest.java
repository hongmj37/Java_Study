package ReStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorTest {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("홍");
        ls.add("호옹");
        ls.add("호오옹");

        Iterator it = ls.iterator();
        while (it.hasNext() == true) {
            String result = (String) it.next();
            System.out.println(result);
        }
    }
}
