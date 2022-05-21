package Stream;

import java.util.Arrays;

public class matchTest {
    public static void main(String[] args) {
        int[] num = { 1, 3, 5};
        boolean result = Arrays.stream(num).allMatch(x->x%2==1);
        System.out.println("홀수 인가요 ? " + result);

        result = Arrays.stream(num).anyMatch(x->x%3==0);
        System.out.println("3의 배수가 있나여? "+result);

        result = Arrays.stream(num).noneMatch(x-> x%3==0);
        System.out.println("3의 배수가 없나요? " + result);
    }
        }
