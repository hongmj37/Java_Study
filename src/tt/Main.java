package tt;

public class Main {
    public static void main(String[] args) {
        GenericTest<String> a = new GenericTest<String>();
        GenericTest<Integer> b = new GenericTest<Integer>();

        a.set("10");
        b.set(10);

        System.out.println(a.get());
        System.out.println(b.get());

        System.out.println(a.genericMethod("ABCD"));
        System.out.println(b.genericMethod(3));

        System.out.println(a.genericMethod(3));           //String 객체라도 파라미터 타입에 따라 Integer로 타입 변환
        System.out.println(b.genericMethod("abc"));
    }
}
