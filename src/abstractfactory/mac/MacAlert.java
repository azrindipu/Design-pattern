package abstractfactory.mac;

import abstractfactory.component.Alert;

public class MacAlert implements Alert {
    @Override
    public void createAlert() {
        System.out.println("Creating mac alert");
    }
}
