package Mon.Tue;

import java.util.*;

public class HashTableEx {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<String, String>();
        map.put("Spring","345");
        map.put("Summer","678");
        map.put("Fail","91011");
        map.put("Winter","1212");

        System.out.println(map);

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("아이디, 비번 입력");
            System.out.println("id : ");
            String id = scanner.nextLine();
            System.out.println("pw : ");
            String pw = scanner.nextLine();


            if(map.containsKey(id)){
                if(map.get(id).equals(pw)) {
                    System.out.println("good");
                    break;
                } else {
                    System.out.println("비번 x");
                }
            } else {
                System.out.println("아이디 x");
            }

        }

    }
}
