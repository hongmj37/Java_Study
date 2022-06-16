package JavaTest;

public class iso {
    public static void main(String[] args) {
        boolean output = isIsogram("aba");
        System.out.println(output); // false

        output = isIsogram("Dermatoglyphics");
        System.out.println(output); // true

        output = isIsogram("moOse");
        System.out.println(output); // false
    }
        public static boolean isIsogram(String str) {
            // TODO:
            if (str.length() == 0) {
                return true;
            }

            str = str.toLowerCase();
            boolean result = true;

            for (int i = 0; i < str.length(); i++) {
                for (int j = i+1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        result = false;
                    }
                }
            }
            return result;
        }
}
