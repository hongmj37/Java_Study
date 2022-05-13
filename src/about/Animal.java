package about;

public abstract class Animal {
    public String kind;
    public abstract void sound();
}

class Chicken extends Animal {
    public Chicken(){
        this.kind = "동물";
    }

    public void sound(){
        System.out.println("꼬끼오");
    }
}

class Duck extends Animal {
    public Duck(){
        this.kind = "동물";
    }

    public void sound(){
        System.out.println("꽥꽥");
    }
}

class DogExample{
    public static void main(String[] args) {
        Animal chicken = new Chicken();
        chicken.sound();

        Animal duck = new Duck();
        duck.sound();
    }
}