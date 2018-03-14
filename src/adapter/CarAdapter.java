package adapter;

public class CarAdapter implements Plane {
    Car car;
    public CarAdapter(Car car){
        this.car = car;
    }

    @Override
    public void fly() {
        for (int i=0;i<5;i++){
            car.Drive();
            System.out.println("Car start to fly: "+i);
        }
    }
}
