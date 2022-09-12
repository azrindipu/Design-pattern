package abstractfactory.mac;

import abstractfactory.component.Popup;

public class MacPopup implements Popup {
    @Override
    public void createPopup() {
        System.out.println("Creating mac popup");
    }
}
