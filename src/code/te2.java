package code;

import java.util.ArrayList;

public class te2 {
    public static void main(String[] args) {
        int output2 = partTimeJob(4972);
        System.out.println(output2);
    }

    public static int partTimeJob(int k) {
        // TODO:
        ArrayList<Integer> coin = new ArrayList<>();
        coin.add(500);
        coin.add(100);
        coin.add(50);
        coin.add(10);
        coin.add(5);
        coin.add(1);
        int total = 0;

        while (k > 0) {
            for (int i = 0; i < coin.size(); i++) {
                int count = 0;
                count += k / coin.get(i);
                total += count;
                k -= count * coin.get(i);
            }
        }
        return total;
    }
}