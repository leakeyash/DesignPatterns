package facade;

public class BigScreen implements Screen{
    @Override
    public void on() {
        System.out.println("Big screen on.");
    }

    @Override
    public void off() {
        System.out.println("Big screen off.");
    }
}
