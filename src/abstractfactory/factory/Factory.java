package abstractfactory.factory;

import abstractfactory.component.Alert;
import abstractfactory.component.Popup;

public interface Factory {
    Alert getAlert();
    Popup getPopup();
}
