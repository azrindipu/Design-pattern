package abstractfactory.factory;

import abstractfactory.component.Alert;
import abstractfactory.component.Popup;
import abstractfactory.linux.LinuxAlert;
import abstractfactory.linux.LinuxPopup;

public class LinuxFactory implements Factory {

    private LinuxAlert linuxAlert;
    private LinuxPopup linuxPopup;

    public LinuxFactory() {
        this.linuxAlert = new LinuxAlert();
        this.linuxPopup = new LinuxPopup();
    }

    @Override
    public Alert getAlert() {
        return this.linuxAlert;
    }

    @Override
    public Popup getPopup() {
        return this.linuxPopup;
    }
}
