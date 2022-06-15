package backjoon.반복문;
/* N찍기
time : 1000 ms
memory : 30716 KB

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hong_2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i=1; i<=num; i++){
            System.out.println(i);
        }
    }
}
