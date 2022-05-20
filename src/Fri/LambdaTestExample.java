package Fri;

import static Fri.LambdaTest.*;

public class LambdaTestExample {
    public static void main(String[] args) throws Exception {
        LambdaTest test;
        test = () -> {
            String str = "First";
            System.out.println(str);
        };
        test.check();

        test = () -> {
            System.out.println("Second");
        };
        test.check();
    }
}
