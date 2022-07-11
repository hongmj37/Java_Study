package backjoon.문자열;
/* 단어 공부
time :
memory :
1. bufferedreader로 입력 받기
2. toUpper()로 대문자 변경
3. StringTokenizer로 문자열 분리
4. "키:값" 형태로 저장할 수 있는 것 선언
5. 반복문으로 각 문자열 하나씩 비교하며 문자열 개수 카운트
6. 가장 큰 개수를 가지는 키 반환환 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class hong_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));  //입력받고
        String str = bf.readLine().toUpperCase();                       //대문자로 변경
        StringTokenizer st = new StringTokenizer(str, "");      //문자를 하나 하나 분리시킴
        String[] arr = new String[st.countTokens()];                // 분리된 문자열을 배열에 하나씩 담음
        for(int i=0; i< st.countTokens(); i++) {
            arr[i] = st.nextToken();
        }

        Map<String, Integer> temp = new HashMap<>();     //"키" : "값" 의 형태의 맵을 사용하여 각 알파벳의 수를 저장하고자 함

        for(int i=1; i<arr.length; i++){
            String base = arr[i];               //만약 zZa이면 (ZZA) Z부터 비교 시작
            int count = 0;
            for(int j=0; j<arr.length; j++){
               if(base.equals(arr[j])){        //z와 같은 값이 있다면 count를 + tlzla
                   count++;
               }
             }
            temp.put(arr[i],count);             //temp라는 map에 알파벳과 개수 저장 (내예상 시나리오는 Z:2, Z:2, A:1)
        }
        String result = "";

       /*Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };
        Map.Entry<String, Integer> max = Collections.max(temp.entrySet(), comparator);*/
        Integer maxim = Collections.max(temp.values());
        System.out.println(result);
    }
}

//그래서 가장 큰 value를 가지는 값의 key를 뽑아 결과를 출력하고 싶었음

// 시류ㅐㅁㄹ;아ㅓㄴ실패