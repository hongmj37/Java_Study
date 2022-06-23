package 코플릿테스트;
import java.util.*;

public class Q0624 {

    public static void main(String[] args) {
        int output = test(new int[]{2, 1, 3, 7});
        System.out.println(output);

        output = test(new int[]{-1, 2, -5, 7});
        System.out.println(output);
    }

    public static int test(int[] arr) {
        Arrays.sort(arr);
        int tall = arr.length;
        int test1 = arr[tall - 1] * arr[tall - 2] * arr[tall - 3];
        int test2 = arr[tall - 1] * arr[0] * arr[1];

        return Math.max(test1, test2);
    }
}
