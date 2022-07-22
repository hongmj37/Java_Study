package backjoon.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 설탕 배달
time :
memory :
 */
public class hong_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

       //3으로 지워가면서 5의 배수 만들기
        //3과 5로 나누어 지지 않으면 -1 반환
        //

        int count = 0;

        while (num > 0) {
            // 어떤 수를 5로 나눴을 때 나머지가 3보다 크다면 계속 나눠
            if (num % 5 == 0) {
                count = count + num/5;
                num = 0;
                break;
            }
            else {
                num = num - 3;
                count++;
            }
        }
        if (num != 0){
            count = -1;
        }
        System.out.println(count);
    }
}
