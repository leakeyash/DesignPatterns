package observer;

import java.util.ArrayList;

public class Subject implements Observable {

    private int peopleNumber;
    private int femaleNumber;
    private boolean stateChanged=false;
    private ArrayList<Observer> observers;
    public Subject(){
        observers = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer observer) {
        if(!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.contains(observer))
            observers.remove(observer);
    }

    @Override
    public void notifyObserver(Object values) {
        if(!stateChanged) return;
        for (Observer item:observers
             ) {
            item.update(this,values);
        }
        stateChanged=false;
    }

    @Override
    public void notifyObserver() {
        if(!stateChanged) return;
        for (Observer item:observers
                ) {
            item.update(this,null);
        }
        stateChanged=false;
    }

    public void updateState(){
        stateChanged=true;
    }

    public boolean getState(){
        return stateChanged;
    }

    public void setNewState(int peopleNumber,int femaleNumber){
        this.peopleNumber=peopleNumber;
        this.femaleNumber=femaleNumber;
        notifyObserver();
        updateState();
    }

    public int getPeopleNumber(){
        return peopleNumber;
    }

    public int getFemaleNumber(){
        return femaleNumber;
    }
}
