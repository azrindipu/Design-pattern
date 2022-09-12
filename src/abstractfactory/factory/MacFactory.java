package abstractfactory.factory;

import abstractfactory.component.Alert;
import abstractfactory.component.Popup;
import abstractfactory.mac.MacAlert;
import abstractfactory.mac.MacPopup;

public class MacFactory implements Factory {

    private MacAlert macAlert;
    private MacPopup macPopup;

    public MacFactory() {
        this.macAlert = new MacAlert();
        this.macPopup = new MacPopup();
    }

    @Override
    public Alert getAlert() {
        return this.macAlert;
    }

    @Override
    public Popup getPopup() {
        return this.macPopup;
    }
}
