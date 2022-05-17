package Mon;

import java.util.*;

public class Salad implements Comparable<Salad> {
    int number;
    String kind;
    String sauce;

    public Salad(int number, String kind, String sauce) {
        this.number = number;
        this.kind = kind;
        this.sauce = sauce;
    }

    public int compareTo(Salad salad) {
        if(number > salad.number){
            return 1;
        } else if (number < salad.number) {
            return -1;
        } else {
            return 0;
        }
    }
}
