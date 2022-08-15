package ReStudy;

public class factorialTest {
    public static void main(String[] args) {
        int input = 5;
        System.out.println(factor(input));
    }

    public static int factor(int num){
        if(num <= 1) {
            return num;
        }

        return num * factor(num-1);
    }
}
