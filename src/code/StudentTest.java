package code;

public class StudentTest {
    public static void main(String[] args) {
        Student hong = new Student();
        hong.grade = 3;
        hong.Name = "홍";
        hong.ID = 123;
        Student kim = new Student(456,"김",2);
        System.out.println(hong.showInfo());
        System.out.println(kim.showInfo());
    }
}
