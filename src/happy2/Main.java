package happy2;

public class Main {
    public static void main(String[] args) throws Exception {
        CEO ceo = new CEO();
        Client a = new ClientA();
        Client b = new ClientB();

        ceo.give(a);
        ceo.give(b);
    }
}
