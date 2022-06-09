package code;

import java.util.Arrays;

public class remove {
    public static void main(String[] args) {
        String[] output = removeExtremes(new String[]{"eept","eept","eept"});

        System.out.println(Arrays.toString(output));
    }

    public static String[] removeExtremes(String[] arr) {

        if (arr.length == 0) {
            return null;
        }

        Integer[] ar = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ar[i] = arr[i].length();
        }

        int max = ar[0];
        int min = ar[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] >= max) {
                max = ar[i];
                maxIndex = i;
            }
        }
        for (int j = 0; j < ar.length; j++) {
            if (ar[j] <= min) {
                min = ar[j];
                minIndex = j;
            }
        }
        int index = 0;
        String[] st = new String[ar.length - 2];
        for (int x = 0; x < arr.length; x++) {
            if ( x != maxIndex && x != minIndex) {
                st[index] = arr[x];
                index++;

            }
        }
        return st;
    }
}
