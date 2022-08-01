package backjoon.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 예쁜 A+B
time : 192 ms
memory : 16420 KB
 */
public class hong_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());


        for(int i=1; i<=num; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = A + B;
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + C);
        }
    }
}
