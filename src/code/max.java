package code;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        int num1 = 60;
        int num2 = 48;
        int gcd = getGCD(num1, num2);
        System.out.println("최대 공약수 : " + gcd);
        System.out.println("최소 공배수 : " + (num1 * num2) / gcd);
    }

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2);
    }
}

