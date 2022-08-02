package backjoon.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 달팽이는 올라가고 싶다
time :
memory :
 */
public class hong_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int A = Integer.parseInt(st.nextToken());  //낮 +
        int B = Integer.parseInt(st.nextToken()); //밤 -
        int V = Integer.parseInt(st.nextToken()); //높이

        int base = 0;
        int date = 0;

        while(base < V) {
            if (base != V) {
                base += A;
                if (base != V ){
                    base -= B;
                }
            }
            date++;
        }
        System.out.println(date);
    }
}
