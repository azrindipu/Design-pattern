package observer.observable;

import observer.observers.Observer;

public interface Observable {
    void add(Observer observer) throws Exception;
    void remove (Observer observer) throws Exception;
    void notifyObservers();
    int getData();
    void setDate(int data);
}
