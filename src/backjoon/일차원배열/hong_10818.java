package backjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class hong_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int caseT = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int[] arr = new int[caseT];
        for(int i=0; i<caseT; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for(int j=1; j<arr.length; j++){
            if(min > arr[j]){
                min = arr[j];
            }
        }

        System.out.print(min+ " " +max);

    }
}
