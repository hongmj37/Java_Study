package code;

import java.util.ArrayList;
import java.util.Collections;

public class te {
    public static void main(String[] args) {
        int output = movingStuff(new int[]{60, 73, 80, 87, 103, 109, 119, 123, 128, 129, 136, 146, 153, 168, 182}, 200);
        System.out.println(output); // 3
    }

    public static int movingStuff(int[] stuff, int limit) {
        // TODO:

        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int x : stuff) {
            ls.add(x);
        }
        Collections.sort(ls);
        int total = ls.size();
        while (ls.size() > 1) {
            for (int i = 1; i < ls.size(); i++) {
                int min = ls.get(0);
                int max = ls.get(ls.size()-1);
                if (min + max <= limit) {
                    total -= 1;
                    int index = i;
                    ls.remove(ls.size()-1);
                    ls.remove(0);
                } else {
                    total += 0;
                    ls.remove(ls.size()-1);
                }

            }
        }
        return total;
    }
}
