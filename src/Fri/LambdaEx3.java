package Fri;

public class LambdaEx3 {
    public static void main(String[] args) {
        LambdaTest3 test3;
        test3 = (a, b) -> {
            int output = a + b;
            return output;
        };
        int output = test3.calcu(4, 5);
        System.out.println(output);

        test3 = (a, b) -> { return a+b; };
        int output2 = test3.calcu(2, 5);
        System.out.println(output2);

        test3 = (a, b) -> a+b;
        int output3 = test3.calcu(3,5);
        System.out.println(output3);

        test3 = (a, b) -> sum(a,b);
        int output4= test3.calcu(1, 3);
        System.out.println(output4);
    }
    public static int sum(int a , int b){
        return a + b;
    }
}
