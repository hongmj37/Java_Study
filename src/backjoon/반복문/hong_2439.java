package backjoon.반복문;

/* 별찍기 2
 time : 380 ms
 memory : 22228 KB

 한참 헤메다가 푼 문제이다. 쉽게 생각했는데 조금 어려웠다.
 for문을 세번 쓰지 않아보려고 했지만 사용할 수 있는 것을 최대한 사용해보는 것도 나쁘지 않은 것 같다.
 println을 너무 당연스럽게 사용해서 결과가 뒤죽박죽 되기도 했다.
 금방 이유를 알긴 했으나 항상 코드 작성에 집중 또 집중해야겠다.

 */
//i는 1-6번째 줄을 의미
//j는 빈칸 입력
//x는 별 입력
import java.util.Scanner;

public class hong_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        for(int i=1; i<=star; i++){
            for(int j=1; j<=star-i; j++){
                System.out.print(" ");
            }
            for(int x=1; x<=i; x++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

