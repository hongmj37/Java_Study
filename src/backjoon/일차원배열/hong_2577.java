package backjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 숫자의 개수
time : 128 ms
memory : 14256 KB

처음에 if 문에서 'equal' 대신 '== 대입 연산자'를 사용했더니 계속해서 조건에 충족하지 않아
카운팅 되지 않았다. 약간의 서치와 동료님 덕분에 String은 클래스임을 알게되어 equal로 바꾸어 문제를 해결하였다.
 */
public class hong_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        int result  = a * b * c;
        String str = String.valueOf(result);
        String arr[] = str.split(""); //"1","2","0","0"
        String base[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < base.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (base[i].equals(arr[j])){
                    count++;
                }  //검색할 필요 없는 부분 줄이기
                   //String인 클래스다!
            }
            System.out.println(count);
        }
    }
}

