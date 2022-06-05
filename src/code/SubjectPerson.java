package code;

public class SubjectPerson {
    public static void main(String[] args) {
        Person person = new Person(123, "Hong");
        person.setKorea("국어",100);
        person.setMath("수학",100);

        person.showScore();

    }
}
