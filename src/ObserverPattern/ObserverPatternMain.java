package ObserverPattern;

import ObserverPattern.Observables.Observable;
import ObserverPattern.Observables.ObservableInterface;
import ObserverPattern.Observers.Observer;
import ObserverPattern.Observers.ObserverInterface;

public class ObserverPatternMain {
    public static void main(String[] args) {
        ObservableInterface observable = new Observable();

        ObserverInterface observer1 = new Observer(observable);
        ObserverInterface observer2 = new Observer(observable);
        ObserverInterface observer3 = new Observer(observable);

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        System.out.println("Now changing data in Observable..... ");
        observable.setData(10);
    }
}
