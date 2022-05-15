package sunday3;

public class Basket {
    private Object object;

    Basket(Object object){
        this.object = object;
    }  //생성자 생성
    public void set(Object object) {
        this.object = object;
    }
    public Object get() {
        return object;
    }
}
