package abstractfactory.linux;

import abstractfactory.component.Alert;

public class LinuxAlert implements Alert {
    @Override
    public void createAlert() {
        System.out.println("Creating linux alert");
    }
}
