package tt;

public class Main {
    public static void main(String[] args) {
        GenericTest<String> a = new GenericTest<String>();
        GenericTest<Integer> b = new GenericTest<Integer>();

        a.set("10");
        b.set(10);

        System.out.println(a.get());
        System.out.println(b.get());
    }
}
