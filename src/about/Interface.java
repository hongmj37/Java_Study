package about;

interface Animal1 {
    public abstract void cry();   //인터페이스 메서드는 public abstract로 선언
}
interface Pet {
    void play();
}

class Horse implements Animal1, Pet{
    public void cry(){
        System.out.println("힝");
    }
    public void play(){
        System.out.println("경주 참여");
    }
}

class Cow implements  Animal1, Pet{
    public void cry(){
        System.out.println("음메");
    }
    public void play(){
        System.out.println("우유 생산");
    }
}
public class Interface {
    public static void main(String[] args) {
        Horse horse = new Horse();
        Cow cow = new Cow();

        horse.cry();
        horse.play();
        cow.cry();
        cow.play();
    }
}
