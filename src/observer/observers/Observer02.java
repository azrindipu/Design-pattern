package observer.observers;

import observer.observable.Observable;

public class Observer02 implements Observer {

    private Observable observable;

    @Override
    public void update() {
        System.out.println("I am from "+Observer02.class.getName());
        System.out.println("Calling subject to get updated data");
        int dataFromSubject = observable.getData();
        System.out.println("Data from subject: "+dataFromSubject);

    }

    @Override
    public void addSubject(Observable observable) {
        this.observable = observable;
    }
}
