package backjoon.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 곱셈
time : 124 ms
memory : 14164 KB
 */

public class hong_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(bf.readLine());
        String second = bf.readLine();
        String[] arr = second.split("");

        int one = first * (Integer.parseInt(arr[2]));
        int two = first * (Integer.parseInt(arr[1]));
        int three = first * (Integer.parseInt(arr[0]));

        int total = one + two*10 + three*100;

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(total);

        }


    }

