package command;

public class LightOnCommandImpl implements Command {
    private Light light;

    public LightOnCommandImpl(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.lightOn();
    }

    @Override
    public void unExecute() {
        this.light.lightOff();
    }
}
