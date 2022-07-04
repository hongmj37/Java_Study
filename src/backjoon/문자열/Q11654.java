package backjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 아스키코드
time : 132 ms
memory : 14256 KB
 */
public class Q11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char what = bf.readLine().charAt(0);
        int num = what;
        System.out.println(num);
    }
}
