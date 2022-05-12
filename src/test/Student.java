package test;

public class Student {
    private String name;
    private int age;
    private int number;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age<1) return;
        this.age = age;
    }

    public int getId(){
        return number;
    }

    public void setId(int number){
        this.number = number;
    }
}

