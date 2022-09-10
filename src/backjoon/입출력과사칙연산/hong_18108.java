package backjoon.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1998년생인 내가 태국에서는 2541년생?!
 * time : 120ms
 * memory : 14240KB
 */
public class hong_18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(bf.readLine());

        int result = age - 543;
        System.out.println(result);

    }
}
