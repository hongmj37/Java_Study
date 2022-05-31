package code;

public class timeTest {
    public static int timeComplex(int[] arr, int num){
        return arr[num];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 1; //인덱스번호
        int result = timeComplex(arr, num);

        System.out.println(result);
    }

}
