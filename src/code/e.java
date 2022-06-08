package code;

public class e {
    public static void main(String[] args) {
        String output = insertDash("454793");
        System.out.println(output); // --> 4547-9-3
    }


    public static String insertDash(String str) {

        String[] arr = str.split("");
        int[] arr2 = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }

        String result = String.valueOf(arr2[0]);

        for (int j = 1; j < arr2.length; j++) {
            if (arr2[j-1] % 2 == 1 && arr2[j] % 2 == 1) {
                result += "-" + arr[j];
            }
            else {
                result += arr[j];
            }
        }
        return result;
    }
}