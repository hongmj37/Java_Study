package backjoon.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 팩토리얼
time : 124 ms
Memory : 14104 KB
 */
public class hong_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int result = 1;
        for(int i=1; i<=num; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
