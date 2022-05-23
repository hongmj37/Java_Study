package StaticTest;

import com.sun.security.jgss.GSSUtil;

public class MSTest {
    public static void main(String[] args) {
        Friend one = new Friend();
        Friend two = new Friend();

        one.str2 = "난 클래스 변수다";
        System.out.println(one.str2);
        System.out.println(two.str2);
        System.out.println(Friend.str2);
    }
}
