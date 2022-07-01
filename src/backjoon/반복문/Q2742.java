package backjoon.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 기찍 N
time : 908 ms
memory : 28772 KB
시간초가 왤케 많이 나온거지?
아마 system.out.print를 여러 번 해서 인 것 같긴하다.
StirngBuilder를 사용해보면 시간을 줄일 수 있을 것 같다.
 */
public class Q2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        for(int i=num; i>0; i--){
            System.out.println(i);
        }
    }
}
