package 코플릿테스트;
import java.util.*;
import java.util.stream.IntStream;

public class Q0627 {
    public static void main(String[] args) {
        int[] output = bubbleSort(new int[]{2, 1, 3});
        System.out.println(output); // --> [1, 2, 3]
    }

    public static int[] bubbleSort(int[] arr) {
        // TODO:
        ArrayList<Integer> base = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            base.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int min = base.get(0);
            int index = 0;
            for (int j = 1; j < base.size(); j++) {
                if (min > base.get(j)) {
                    min = base.get(j);
                    index = j;
                }
            }
            result.add(min);
            base.remove(index);
        }

        int[] good = {};
        good = result.stream()
                .mapToInt(i -> i)
                .toArray();
        return good;
    }
}