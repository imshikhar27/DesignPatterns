package ObserverPattern.Observers;

import ObserverPattern.Observables.ObservableInterface;

public class Observer implements ObserverInterface {
    ObservableInterface obeservable;
    public Observer(ObservableInterface obeservable) {
        this.obeservable = obeservable;
    }

    public void update() {
        System.out.println("From update of "+this.getClass().getCanonicalName());
        System.out.println(this.obeservable.getData());
    }
}
