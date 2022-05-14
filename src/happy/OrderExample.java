package happy;

public class OrderExample {
    public static void main(String[] args) {
        CEO ceo = new CEO();
        ClientA a = new ClientA();
        ClientB b = new ClientB();

        ceo.give(a);
        ceo.give(b);
    }
}
