package JavaTest;
import java.util.*;

public class eee {
    public static void main(String[] args) {
        String output = decryptCaesarCipher("khoor zruog", 3);
        System.out.println(output); // --> helloString output = decryptCaesarCipher("khoor zruog", 3);

        output = decryptCaesarCipher("nzop delepd dfaazced jzf", 11);
        System.out.println(output); // --> hello
    }

        public static String decryptCaesarCipher(String str, int secret) {
            if(str.length() == 0) {
                return str;
            }
            String arr = "";

            for(int i=0; i<str.length(); i++){
                arr += (char) (str.charAt(i)-secret);
                if(str.charAt(i)== 0x20){
                    arr+= ' ';
                }
                if(str.charAt(i)-secret <= 0x61){
                    arr += (char) (str.charAt(i)+secret);
                }
                }

        return arr;
        }
    }
