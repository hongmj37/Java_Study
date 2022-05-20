package Fri;

public class LambdaEx {
    public static void main(String[] args) {
        LambdaTest2 test2;
        test2 = (i) -> {
            int num = i * 10;
            System.out.println(num);
        };
        test2.okay(3);

        test2 = (i) -> System.out.println(i*10);
        test2.okay(5);
    }
}
