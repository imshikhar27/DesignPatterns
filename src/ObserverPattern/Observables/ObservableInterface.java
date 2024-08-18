package ObserverPattern.Observables;

import ObserverPattern.Observers.ObserverInterface;

import java.util.List;

public interface ObservableInterface {
    public void notifyObservers();
    public void addObserver(ObserverInterface observer);
    public void removeObserver(ObserverInterface observer);
    public void setData(int data);
    public int getData();
}
