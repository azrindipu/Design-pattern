package observer;

import observer.observable.Observable;
import observer.observable.ObservableImpl;
import observer.observers.Observer;
import observer.observers.Observer01;
import observer.observers.Observer02;

public class Main {
    public static void main(String[] args) throws Exception {
        Observable observable = ObservableImpl.getInstance();
        Observer observer01 = new Observer01();
        observer01.addSubject(observable);
        Observer observer02 = new Observer02();
        observer02.addSubject(observable);
        observable.add(observer01);
        observable.add(observer02);
        observable.notifyObservers();

        System.out.println("When data update in subject\n\n");

        observable.setDate(100);
    }
}
