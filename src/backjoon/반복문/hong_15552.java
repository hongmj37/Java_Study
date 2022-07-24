package backjoon.반복문;
/* 15552번 빠른 A+B
time : 856 ms
memory : 221192 KB
 */
import java.io.*;
import java.util.StringTokenizer;

public class hong_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');
        }
            System.out.println(sb);
        }
    }
