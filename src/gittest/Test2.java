package gittest;

public class Test2 {
    public static void main(String[] args) {
        Student s = new Student();
    }
}

class Human{
    Human(){
        System.out.println("휴먼");
    }
}

class Student extends Human{
    Student(){
        super();
        System.out.println("학생");
    }
}