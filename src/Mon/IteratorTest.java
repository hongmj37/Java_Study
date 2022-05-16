package Mon;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("가");
        ls.add("나");
        ls.add("다");

        Iterator it = ls.iterator();
        while (it.hasNext()==true){
            String letter = (String) it.next();
            System.out.print(letter + " ");
        }
        System.out.println();

        for (String letter2 : ls){
            System.out.print(letter2 + " ");
        }
    }
}
