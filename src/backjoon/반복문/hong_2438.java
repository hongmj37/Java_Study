package backjoon.반복문;
/* 별찍기 1
 time : 312 ms
 memory : 18148 KB

 별찍기 2를 풀기위해 별찍기 1부터 풀게 되었다.
 생각보다 수월하게 풀린 문제다. 2중 for문을 쓰는 감을 잊지말자 !

 */
import java.util.Scanner;

public class hong_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();

        for(int i=1; i<=result; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
