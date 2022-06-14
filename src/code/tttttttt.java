package code;

public class tttttttt {
    public static void main(String[] args) {
        boolean output = superIncreasing(new int[]{979, 1737, -2146, -337, 1316});
        System.out.println(output);
    }
        public static boolean superIncreasing(int[] arr) {
            boolean result = false;

            for (int i = 1; i < arr.length; i++) {
                int total = 0;
                for (int j = 0; j < i; j++) {
                    total += arr[j];
                }
                    if (total < arr[i]) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
            return result;
        }
}

