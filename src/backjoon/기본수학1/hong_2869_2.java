package backjoon.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 달팽이는 올라가고 싶다
time : 128 ms
memory : 14212 KB

시간초과때문에 엄청 오래 걸림 -_-
 */
public class hong_2869_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());  //낮 +
        int B = Integer.parseInt(st.nextToken()); //밤 -
        int V = Integer.parseInt(st.nextToken()); //높dl

        int base = V - B;
        int date = A - B;
        int result = base / date;

        if (base % date != 0){
            result ++;
        }
        System.out.println(result);
    }
}
/*
0 + 2 = 2, 2 - 1 = 1
1 + 2 = 3, 3 - 1 = 2
2 + 2 = 4, 4 - 1 = 3
3 + 2 = 5, 5 - 1 = 4  (*)
4 + 2 = 6, 6 - 1 = 5


 */