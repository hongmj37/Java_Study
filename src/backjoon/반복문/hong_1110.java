package backjoon.반복문;
/* 더하기 사이클
 time : 212 ms
 memory : 17704 KB

 while문에 조건을 잘못 걸면 무한 루프로 돌아가서
 while문을 멈추게 하는 조건이 무조건 들어가야 함을 깨달을 수 있었다.

 Scanner보다 BufferedReader을 사용해보는 것이 좋다는
 코드 리뷰를 받았다 ! 사용해보자

*/
import java.util.Scanner;
public class hong_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while (true) {
            int start = temp / 10;
            int end = temp % 10;
            int sum = start + end;

            temp = end * 10 + sum % 10;
            count++;

            if (num == temp) {
                break;
            }
        }
        System.out.println(count);
    }
}