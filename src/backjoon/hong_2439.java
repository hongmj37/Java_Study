package backjoon;
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

