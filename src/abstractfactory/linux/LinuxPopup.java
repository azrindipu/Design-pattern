package abstractfactory.linux;

import abstractfactory.component.Popup;

public class LinuxPopup implements Popup {
    @Override
    public void createPopup() {
        System.out.println("Creating linux popup");
    }
}
