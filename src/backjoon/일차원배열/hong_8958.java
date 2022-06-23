package backjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* OX퀴즈
time :
memory :

public class hong_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int caseT = Integer.parseInt(bf.readLine());
        int[] arr = new int[caseT];
        for(int i=0;i<caseT; i++){
            int num = Integer.parseInt(bf.readLine());
            StringTokenizer st = new StringTokenizer(bf.readLine());
            arr[i] = Integer.parseInt(st.nextToken());

            int count=0;

            for(int x=0; x<arr.length; x++){
                for(int j=0; j<arr.length; j++){
                 if(arr[x]=='X') {
                     return
                 }
                 if(arr[x] == arr[j]){
                     count++;
                 }

                 }


        }

        }


    }
}
*/