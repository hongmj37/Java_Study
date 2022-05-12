package gittest;

class Person{
    String name;
    int age;

    void learn(){
        System.out.println("공부를 합니다");
    }
    void walk(){
        System.out.println("걷습니다");
    }
    void eat(){
        System.out.println("밥을 먹습니다");
    }
}

class Programmer extends Person{
    String companyName;

    void coding(){
        System.out.println("코딩합니다");
    }
        }

class Dancer extends Person{
    String groupName;

    void dancing(){
        System.out.println("춤춥니다");
    }
}

class Singer extends Person{
    String bandName;
    void singing(){
        System.out.println("노래합니다");
    }
    void playing(){
        System.out.println("기타칩니다");
    }
}

 public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.name="김코딩";
        p.age=24;
        p.learn();
        p.eat();
        p.walk();
        System.out.println(p.name);

        Programmer pg = new Programmer();
        pg.name = "박해커";
        pg.age = 34;
        pg.learn();
        pg.coding();
        System.out.println(pg.name);

    }
}
