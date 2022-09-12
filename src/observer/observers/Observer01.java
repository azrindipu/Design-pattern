package observer.observers;

import observer.observable.Observable;

public class Observer01 implements Observer {

    private Observable observable;

    public Observer01() {

    }

    @Override
    public void update() {
        System.out.println("I am from "+Observer01.class.getName());
        System.out.println("Calling observer to get the update");
        int dataFromSubject = this.observable.getData();
        System.out.println("Data from subject: "+dataFromSubject);

    }

    @Override
    public void addSubject(Observable observable) {
        this.observable = observable;
    }
}
