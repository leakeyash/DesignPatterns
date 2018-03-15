package adapter;

public class FlyCar {
    public static void main(String[] args){
        Plane plane = new A320();
        plane.fly();
        Car car = new Benz();
        car.Drive();
        CarAdapter carAdapter = new CarAdapter(car);
        carAdapter.fly();
    }
}
