package backjoon.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hongg_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int result = calcu(num); //밑에 메서드 결과가 result에 저장됨

        System.out.println(result);
    }
    public static int calcu(int num){ //팩토리얼 계산 메서드
        if(num <= 1){  //재귀함수 종료 조건 : num이 1이 되었을 때 1을 리턴하고 종료
            return 1;
        }
        return num * calcu(num-1);
    }

}
