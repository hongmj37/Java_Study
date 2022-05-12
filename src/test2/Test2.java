package test2;

import test.Parent;

public class Test2 {
    public static void main(String[] args) {
        Parent p = new Parent();
        //System.out.println(p.c);   Test2가 상속받은 하위클래스가 아니라서 오류
        System.out.println(p.d);
    }
}
