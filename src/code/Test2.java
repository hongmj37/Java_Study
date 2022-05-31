package code;

public class Test2 {
    public String test2(String str){
        char[] arr = str.toCharArray();
        String result = "";
        for(int i = 0; i<arr.length;i++){
            if(arr[i-1]%2==1 && arr[i]%2==1){
                result = result + arr[i] + "-";
            } else {
                result = result + arr[i];
            }
            if(i==arr.length -1) {
                result = result + arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
