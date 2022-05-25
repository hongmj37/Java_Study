package Mon;

import java.util.List;
import java.util.ArrayList;


public class ArrayListTest {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>(3);

        ls.add("crown");
        ls.add("lotte");
        ls.add("orion"); //추가
        ls.add("haetae"); //추가

        for(int i=0; i < ls.size(); i++){
            String need = ls.get(i);
            System.out.println(i + "번 인덱스는 "+ need +"입니다.");
        }
    }
}
