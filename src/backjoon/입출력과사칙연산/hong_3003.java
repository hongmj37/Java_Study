package backjoon.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/** 킹, 퀸, 룩, 비숍, 나이트, 폰
 * time :
 * memory :
 */
public class hong_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int[] base = new int[6];
        int[] original = new int[]{ 1, 1, 2, 2, 2, 8 };

        for(int x=0; x<st.countTokens(); x++){
            base[x] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<original.length; i++) {
            base[i] = original[i] - base[i];
            System.out.print(base[i] + " ");
        }
    }
}
