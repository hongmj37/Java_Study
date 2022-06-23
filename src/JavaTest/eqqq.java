package JavaTest;
import java.util.*;

public class eqqq {
    public static void main(String[] args) {
        String output = compressString("abc");
        System.out.println(output); // --> "abc"

        output = compressString("wwwggoppopppp");
        System.out.println(output);
    }

    public static String compressString(String str) {
        // TODO:
        if (str.length() == 0) {
            return str;
        }

        char ch = str.charAt(0);
        String result = "";
        str = str + ' ';
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            } else {
                if (count >= 3) {
                    result = result + count + ch;
                } else {
                    for (int j = 0; j < count; j++) {
                        result = result + ch;
                    }
                }
                ch = str.charAt(i);
                count = 1;
            }
        }
        return result;
    }