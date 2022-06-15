package backjoon.반복문;
/* N찍기
time : 1000 ms
memory : 30716 KB

처음으로 Scanner 대신 BufferedReader을 쓴 날 !
괜히 뿌듯한 기분이다 ~ !
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
