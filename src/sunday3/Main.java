package sunday3;
//제네릭을 사용하지 않고 다양한 타입을 하나의 클래스에 넣기
public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket("String");
        String a = (String) basket.get();
        //Integer b = (Integer) basket.get();
    }
}
