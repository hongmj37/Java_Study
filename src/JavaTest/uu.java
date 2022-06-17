package JavaTest;

import java.util.*;

public class uu {
    public static void main(String[] args) {
        String output = computeSquareRoot(8);
        System.out.println(output);

        output = computeSquareRoot(36);
        System.out.println(output);
    }
        public static String computeSquareRoot(int num) {

            double arr[] = {1, 0.1, 0.01, 0.001};
            double stop = 1;

            for(int i=0; i<arr.length; i++){
                while( stop * stop < num ){
                    stop += arr[i];
                }
                if( stop * stop == num ){
                    return String.format("%.2f", stop);
                } else {
                    stop = stop - arr[i];
                }
            }
            return String.format("%.2f", stop);
        }
    }
