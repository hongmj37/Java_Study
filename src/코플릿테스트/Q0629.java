package 코플릿테스트;
import java.util.*;
import java.util.stream.Collectors;

public class Q0629 {
    public static void main(String[] args) {
        int[] base = new int[]{1, 2, 3, 4, 5};
        int[] sample = new int[]{1, 3};
        boolean output = isSubsetOf(base, sample);
        System.out.println(output); // --> true

        sample = new int[]{6, 7};
        output = isSubsetOf(base, sample);
        System.out.println(output); // --> false

        base = new int[]{10, 99, 123, 7};
        sample = new int[]{11, 100, 99, 123};
        output = isSubsetOf(base, sample);
        System.out.println(output);
    }

    public static boolean isSubsetOf(int[] base, int[] sample) {

        boolean result = true;
        List<Integer> baseList = Arrays.stream(base)
                .boxed().collect(Collectors.toList());

        for (int i = 0; i < sample.length; i++) {
            if (!baseList.contains(sample[i])) {
                result = false;
            }
        }
        return result;
    }
}
