package gittest;

public class Composite{
    int id;
    String name;
    Address address;

    public Composite(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void showInfo() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("서울", "한국");
        Address address2 = new Address("도쿄", "일본");

        Composite e = new Composite(1, "김코딩", address1);
        Composite e2 = new Composite(2, "박해커", address2);

        e.showInfo();
        e2.showInfo();
    }
}

class Address {
    String city, country;

    public Address(String city, String country){
        this.city = city;
        this.country = country;
    }
}