package backjoon.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/* X보다 작은 수
time : 200ms
memory : 17288KB
 */
public class hong_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(bf.readLine()," ");

        for(int i=0; i<N; i++){
            int base = Integer.parseInt(st.nextToken());
            if( base < X ){
                sb.append(base + " ");
            }
        }
        System.out.println(sb);

    }
}
