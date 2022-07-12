package backjoon.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/* A/B
time : 136 ms
memory : 14320 KB
 */
public class hong_1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        double A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());

        System.out.print(A/B);


    }

}
