package backjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 알파벳 찾기
time : 144ms
memory : 15820KB
 */

public class hong_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String word = bf.readLine();

        int[] arr = new int[26];

        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }

        for(int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);

            if(arr[ch-'a']==-1) {
                arr[ch - 'a'] = i;
            }
        }

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
