package backjoon;

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
