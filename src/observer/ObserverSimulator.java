package observer;

public class ObserverSimulator {
    public static void main(String[] args){
        Subject subject=new Subject();
        FirstObserver firstObserver=new FirstObserver();
        subject.addObserver(firstObserver);
        subject.addObserver(new SecondObserver());
        subject.setNewState(100,20);
        subject.removeObserver(firstObserver);
        subject.setNewState(80,50);
        subject.notifyObserver(99);
    }
}
