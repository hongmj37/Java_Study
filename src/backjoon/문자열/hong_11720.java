package backjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 숫자의 합
time : 128ms
memory : 14288KB
 */

public class hong_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int count = 0;

        for (int i = 0; i < num; i++) {
            count += str.charAt(i)- '0';
        }
        System.out.println(count);
    }
}
