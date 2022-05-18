package Mon.Tue.Wed;

public class Outer{
    private int num = 100;
    private static int sNum = 200;

    private InClass inClass;

    public Outer() {
        inClass = new InClass();
    }

    class InClass{
        int inNum = 10;

        void Test() {
            System.out.println("외부 클래스 인스턴스 변수 = " + num);
            System.out.println("외부 클래스 정적 변수 = " + sNum);
        }
    }
    public void testClass() {
        inClass.Test();
    }
}
