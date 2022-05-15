package sunday2;

public class King implements House{
    @Override
    public void eat() {
        System.out.println("냠냠 움냠냠");
    }

    @Override
    public void work() {
        System.out.println("뚜쉬 하쉬");
    }

    public void sleep(){
        System.out.println("쿨쿨 드르렁");
    }
}
