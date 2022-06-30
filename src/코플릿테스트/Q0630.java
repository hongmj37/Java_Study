package 코플릿테스트;
import java.util.*;
public class Q0630 {
    public static void main(String[] args) {
        long output = power(4, 15);
        System.out.println(output);
    }
    public static long power(int base, int exponent) {
        // TODO:
        long result = 1;
        long temp = 0;
        for(int i=1; i<=exponent; i++){
            temp = result * base;
            result = temp;
        }
        return result%94906249;
    }
}
