package code;
import java.util.*;

public class tttt {
    public static void main(String[] args) {
        String[] input = new String[]{
                "hello",
                "wolrd",
        };
        String output = readVertically(input);
        System.out.println(output); // --> "hweolllrod"
    }

        public static String readVertically(String[] arr) {
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i].length()) {
                    max = arr[i].length();
                }
            }

            String result;
            String[] str = new String[max];

            for (int i = 0; i < arr.length; i++) {
                result = arr[i];
                for (int j = 0; j < result.length(); j++) {
                    if (str[j] == null) {
                        str[j] = Character.toString(result.charAt(j));
                    } else {
                        str[j] = str[j] + result.charAt(j);
                    }
                }
            }
            String total = "";
            for (int i = 0; i < str.length; i++) {
                total += str[i];
            }
            return total;
        }
    }
