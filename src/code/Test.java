package code;

public class Test {
    public Boolean Testing(int[] arr){
        int total = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] <= total){
                return false;
            }else{
                total += arr[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Test testing = new Test();
    }
}


