package abstractfactory.factory;

import abstractfactory.component.Alert;
import abstractfactory.component.Popup;
import abstractfactory.window.WindowAlert;
import abstractfactory.window.WindowPopup;

public class WindowsFactory implements Factory {

    private WindowAlert windowAlert;
    private WindowPopup windowPopup;

    public WindowsFactory() {
        this.windowAlert = new WindowAlert();
        this.windowPopup = new WindowPopup();
    }

    @Override
    public Alert getAlert() {
        return this.windowAlert;
    }

    @Override
    public Popup getPopup() {
        return this.windowPopup;
    }
}
