package observer;

public class FirstObserver implements Observer,Display{

    private int peopleNumber;
    @Override
    public void display() {
        System.out.println("People Number:"+peopleNumber);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if(observable instanceof Subject){
            Subject subject=(Subject)observable;
            peopleNumber = subject.getPeopleNumber();
            display();
        }
    }
}
