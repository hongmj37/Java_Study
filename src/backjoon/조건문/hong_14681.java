package backjoon.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 사분면 고르기
time : 132 ms
memory : 14168 KB
 */
public class hong_14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());

        if(A>0 && B>0) {
            System.out.println(1);
        }
        else if(A<0 && B>0){
            System.out.println(2);
        }
        else if(A<0 && B<0){
            System.out.println(3);
        }
        else {
            System.out.println(4);
        }
    }
}
