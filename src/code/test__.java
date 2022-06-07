package code;

import java.util.ArrayList;

public class test__ {
    public static void main(String[] args) {
        boolean output = ABCheck("aaaaaccccbbbbb");
        System.out.println(output); // --> true
    }
        public static boolean ABCheck(String str) {
            // TODO:
            str = str.toLowerCase();
            ArrayList<String> arr = new ArrayList<String>();

            for (int i = 0; i < str.length(); i++) {
                arr.add(String.valueOf(str.charAt(i)));
            }

            for (int j = 0; j < arr.size()-4; j++) {
                if (arr.get(j).contains("a")  && arr.get(j + 4).contains("b") ) {
                    return true;

                } else if (arr.get(j).contains("b") && arr.get(j + 4).contains("a")) {
                    return true;
                }

            }
            return false;
        }
}

