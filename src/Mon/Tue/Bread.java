package Mon.Tue;

import java.util.*;

public class Bread {
    public static void main(String[] args) {
        Map<String, Integer> bread = new HashMap<>();

        bread.put("피자빵", 4000);
        bread.put("초코빵",3000);
        bread.put("앙버터",5000);
        bread.put("깜빠뉴",6000);
        bread.put("치아바타",2000);

        System.out.println("빵의 개수는 " + bread.size() + "개");
        System.out.println();
        System.out.println("치아바타 가격은 " + bread.get("치아바타") + "원");
        System.out.println();


        Set<String> keySet = bread.keySet();

        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = bread.get(key);
            System.out.println(key + "의 가격은 " + value+ "원");
            System.out.println();


            Set<Map.Entry<String, Integer>> entrySet = bread.entrySet();
            Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

            while(entryIterator.hasNext()){
                Map.Entry<String, Integer> test = entryIterator.next();
                String name = test.getKey();
                Integer price = test.getValue();
                System.out.println(name + "의 가격은 " + price+ "원");
            }

        }

    }
}
