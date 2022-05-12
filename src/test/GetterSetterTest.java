package test;

public class GetterSetterTest {
    public static void main(String[] args) {
        Student h = new Student();
        h.setName("홍민정");
        h.setAge(25);
        h.setId(5);

        String name = h.getName();
        System.out.println( "이름은 " + name);
        int age = h.getAge();
        System.out.println("나이는 " + age);
        int number = h.getId();
        System.out.println("번호는 " + number);
    }
}
