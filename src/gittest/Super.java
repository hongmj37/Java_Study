package gittest;

public class Super {
    public static void main(String[] args) {
        Lower l = new Lower();
        l.callNum();
    }
}

class Upper{
    int count = 20;
}

class Lower extends Upper{
    int count = 15;

    void callNum() {
        System.out.println(count);
        System.out.println(this.count);
        System.out.println(super.count);
    }
}