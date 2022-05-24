package JavaTest;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {0, 1,2,3,4,5};
        int[] arr3 = Arrays.copyOfRange(arr, 1, arr.length);
        int[] arr5 = Arrays.copyOfRange(arr,1,5);
        int[] arr6 = Arrays.copyOfRange(arr,1,4);

        int[] arr4 = Arrays.copyOfRange(arr, 1, arr.length-1);
        String str = Arrays.toString(arr3);
        String str2 = Arrays.toString(arr4);
        String str3 = Arrays.toString(arr5);
        String str4 = Arrays.toString(arr6);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(arr.length);
        System.out.println();
        System.out.println(str4);
        System.out.println(str3);
    }
}
