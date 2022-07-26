package backjoon.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
/* A+B-3
time : 136 ms
memory : 14224 KB
 */
public class hong_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        while(num>0){
            StringTokenizer st = new StringTokenizer(bf.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(A+B);
            num--;
        }
    }

    /*
         time :  ms
         memory :  KB

    public static class hong_10950 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();

            for(int i = 0; i < x; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a+b);
            }

        }
    }
     */
}
