package command;

public class LightImpl implements Light{
    @Override
    public void lightOn() {
        System.out.println("Light ON");
    }

    @Override
    public void lightOff() {
        System.out.println("Light OFF");
    }
}
