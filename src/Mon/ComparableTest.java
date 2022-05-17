package Mon;

import java.util.Set;
import java.util.TreeSet;

public class ComparableTest {
    public static void main(String[] args) {
        Set<Salad> food = new TreeSet<>();

        Salad salad1 = new Salad(3, "Grilled Chicken","Oriental");
        Salad salad2 = new Salad(2, "Salmon","Sriracha Mayo");
        Salad salad3 = new Salad(1, "Shrimp","lemon");

        food.add(salad1);
        food.add(salad2);
        food.add(salad3);

        for(Salad salad : food){
            System.out.println(salad.number + " " + salad.kind + " " + salad.sauce);
        }
    }
}
