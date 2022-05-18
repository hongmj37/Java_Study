package Mon.Tue.Wed;

public class Mains {
    public static void main(String[] args) {
        Test test = Test.GOOD;

        switch (test) {
            case PERFECT:
                System.out.println("대박 퍼펙트");
                break;
            case GOOD:
                System.out.println("움 ~ 굿 ~");
                break;
            case BAD:
                System.out.println("훔");
                break;
        }
    }
}
