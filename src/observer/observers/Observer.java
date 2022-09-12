package observer.observers;

import observer.observable.Observable;

public interface Observer {
    void update();
    void addSubject(Observable observable);
}
