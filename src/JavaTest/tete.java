package JavaTest;

import java.util.Arrays;

import static java.lang.Math.round;

public class tete {
    public static void main(String[] args) {
        int output = numberSearch("Hello6 ");
        System.out.println(output); // --> 1

        output = numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }
        public static int numberSearch(String str) {

            if(str.length() ==0) {
                return 0;
            }
            int sum = 0;
            String str2 = str.replaceAll("[^\\d]","");
            String[] arr = str2.split("");
            int[] arr2 = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
            for(int i=0; i<str2.length(); i++){
                sum += arr2[i];
            }

            String str3 = str.replaceAll("[^\\w]","");
            str3 = str3.replaceAll("[0-9]","");
            str3 = str3.trim();

            float strcount = str3.length();
            int result;
            result = (int) Math.round(sum/strcount);

        return result;

        }

}
