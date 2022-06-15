package JavaTest;

public class t {
    public static void main(String[] args) {
        Integer output = modulo(0, 4);
        System.out.println(output); // --> 1

        //output = modulo(25, 0);
        //System.out.println(output);
    }
    public static Integer modulo(int num1, int num2) {
        if(num2 == 0) {
            return null;
        }
        if(num1 == 0) {
            return 0;
        }
        int temp = 0;
        while (num1 >= 0) {
            num1 = num1 - num2;
            temp = num1;
            if (num2 > temp){
                break;
            }
        }
        return temp;
    }
}
