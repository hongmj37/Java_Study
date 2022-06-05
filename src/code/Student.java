package code;

public class Student {
    public int ID;
    public String Name;
    public int grade;

    public Student(){

    }
    public Student(int ID, String Name, int grade) {
        this.ID = ID;
        this.Name = Name;
        this.grade = grade;


    }
    public String showInfo() {
        return Name + " 학생의 학번은 " + ID + " 이고 " + grade + "학년 입니다.";
    }
}
