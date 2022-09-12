package abstractfactory.window;

import abstractfactory.component.Alert;

public class WindowAlert implements Alert {
    @Override
    public void createAlert() {
        System.out.println("Creating windows alert");
    }
}
