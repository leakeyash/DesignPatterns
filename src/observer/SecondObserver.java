package observer;

public class SecondObserver implements Observer,Display {
    private int peopleNumber;
    private int femaleNumber;
    @Override
    public void display() {
        System.out.println("People Number:"+peopleNumber+"; female Number: "+femaleNumber);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if(observable instanceof Subject){
            Subject subject=(Subject)observable;
            if(arg==null){
                peopleNumber = subject.getPeopleNumber();
                femaleNumber =subject.getFemaleNumber();
            }
            else if(arg instanceof Integer){
                peopleNumber = (Integer)arg;
            }
            display();
        }
    }
}
