package StaticTest;

public class Friend {
    public String str1 = "인스턴스 변수";

    public static String str2 = "클래스 변수";

    public static void method1() {
        //System.out.println(str1);
        System.out.println(str2);
    }

    public void method2(){
        System.out.println(str1);
        System.out.println(str2);
    }
}
