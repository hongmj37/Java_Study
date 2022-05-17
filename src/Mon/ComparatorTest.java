package Mon;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {
    public static void main(String[] args) {
        ArrayList<Salad2> food = new ArrayList<>();

        Salad2 salad1 = new Salad2(45, "Grilled Chicken", "Oriental");
        Salad2 salad2 = new Salad2(98, "Salmon", "Sriracha Mayo");
        Salad2 salad3 = new Salad2(23, "Shrimp", "lemon");

        food.add(salad1);
        food.add(salad2);
        food.add(salad3);

        for (Salad2 sal : food) {
            System.out.println(sal.number + " " + sal.kind + " " + sal.sauce);
        }

        Collections.sort(food, new SortNum());

        for (Salad2 sal : food) {
            System.out.println(sal.number + " " + sal.kind + " " + sal.sauce);
        }
    }
}
