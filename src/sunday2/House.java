package sunday2;

public interface House {
    final static int hand = 2;
    int foot = 2;               //상수만 사용가능하여 final static 생략 가능

    abstract void eat();        //추상메서드만 사용가능하여 abstract 생략 가능
    abstract void sleep();
    abstract void work();
}
