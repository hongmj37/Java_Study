package Mon;

import java.util.Comparator;

public class SortNum implements Comparator<Salad2> {
    public int compare(Salad2 s1, Salad2 s2){
        return s1.number - s2.number;
    }
}
