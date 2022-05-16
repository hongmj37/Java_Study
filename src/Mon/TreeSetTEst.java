package Mon;

import java.util.TreeSet;

public class TreeSetTEst {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();

        tree.add("Lemon Tree");
        tree.add("Apple Tree");
        tree.add("Christmas Tree");

        System.out.println(tree);
        System.out.println(tree.first());
        System.out.println(tree.last());
        System.out.println(tree.higher("Christmas"));
        System.out.println(tree.subSet("Christmas","Lemon"));
    }
}
