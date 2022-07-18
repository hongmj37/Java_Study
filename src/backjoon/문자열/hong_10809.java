package backjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 알파벳 찾기
time :
memory :
 */
public class hong_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(),"");

        for(int i=0; i< st.countTokens(); i++){

            System.out.print(i);
        }

    }
}
