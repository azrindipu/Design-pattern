package observer.observable;

import observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {

    private static ObservableImpl observable;
    private List<Observer> observers;
    private int data;

    public static synchronized ObservableImpl getInstance(){
        if(observable == null){
            observable = new ObservableImpl();
        }
        return observable;
    }

    public ObservableImpl() {
        this.observers=new ArrayList<>();
        this.data=0;
    }

    @Override
    public void add(Observer observer) throws Exception {
        if(observer == null){
            throw new Exception("Observer can not be null");
        }
        if(observers.contains(observer)){
            throw new Exception("This observer is already in list");
        }
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) throws Exception {
        if(!observers.contains(observer)){
            throw new Exception("Observer does not exist");
        }
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update();
        }
    }

    @Override
    public int getData(){
        return this.data;
    }

    @Override
    public void setDate(int data) {
        this.data=data;
        this.notifyObservers();
    }
}
