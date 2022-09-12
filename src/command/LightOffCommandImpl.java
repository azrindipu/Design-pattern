package command;

public class LightOffCommandImpl implements Command {

    private Light light;

    public LightOffCommandImpl(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.lightOff();
    }

    @Override
    public void unExecute() {
        this.light.lightOn();
    }
}
