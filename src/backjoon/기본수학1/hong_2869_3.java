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
public class hong_2869_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        if(V % (A-B) == 0) {
            System.out.println( V / (A - B));
        }
        else {
            System.out.println(V / (A - B) + 1);
        }

    }
}
/*
3 1 7 일 때,
7 / (3 - 1) = 3.XXX
(7 - 1) / (3 - 1) = 3
 */