package ObserverPattern.Observables;

import ObserverPattern.Observers.ObserverInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Observable implements ObservableInterface{
    List<ObserverInterface> observers;
    private int data;
    public Observable() {
        this.data=0;
        this.observers = new ArrayList<ObserverInterface>();
    }

    @Override
    public void notifyObservers() {
        for(ObserverInterface observer : observers) {
            observer.update();
        }
    }

    @Override
    public void addObserver(ObserverInterface observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverInterface observer) {
        this.observers.remove(observer);
    }

    public void setData(int data) {
        this.data = data;
        this.notifyObservers();
    }
    public int getData() {
        return this.data;
    }
}
