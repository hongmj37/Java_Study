package code;

public class Person {
    int ID;
    String Name;

    Subject korea;
    Subject math;

    Person(int ID, String Name){
        this.ID = ID;
        this.Name = Name;

        korea = new Subject();
        math = new Subject();
    }

    public void setKorea(String name, int score){
        korea.subName = name;
        korea.score = score;
    }

    public void setMath(String name, int score){
        math.subName = name;
        math.score = score;
    }

    public void showScore() {
        int total = korea.score + math.score;
        System.out.println("점수는 " + total + "입니다.");
    }
}
