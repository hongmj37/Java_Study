package test4;

public class VehicleTest{
    public static void main(String[] args){
        Car car = new Car();
        Vehicle vehicle = (Vehicle) car;
        Car car2 = (Car) vehicle;
        //MotorBike motorBike = (MotorBike) car;
    }
}