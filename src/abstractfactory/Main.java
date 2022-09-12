package abstractfactory;

import abstractfactory.component.Alert;
import abstractfactory.component.Popup;
import abstractfactory.factory.Factory;
import abstractfactory.factory.LinuxFactory;
import abstractfactory.factory.MacFactory;
import abstractfactory.factory.WindowsFactory;

public class Main {
    public static void main(String[] args){

        //for windows
        Factory factory = new WindowsFactory();
        Alert alert = factory.getAlert();
        Popup popup = factory.getPopup();
        alert.createAlert();
        popup.createPopup();

        //for linux
        factory = new LinuxFactory();
        alert = factory.getAlert();
        popup = factory.getPopup();
        alert.createAlert();
        popup.createPopup();

        //for mac
        factory = new MacFactory();
        alert = factory.getAlert();
        popup = factory.getPopup();
        alert.createAlert();
        popup.createPopup();
    }
}
