package abstractfactory.window;

import abstractfactory.component.Popup;

public class WindowPopup implements Popup {
    @Override
    public void createPopup() {
        System.out.println("Creating windows popup");
    }
}
