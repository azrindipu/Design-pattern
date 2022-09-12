package command;

public class Invoker {
    private Command lightOn;
    private Command lightOff;

    public Invoker(Command lightOn, Command lightOff) {
        this.lightOn = lightOn;
        this.lightOff = lightOff;
    }

    public void turnOnLight(){
        this.lightOn.execute();
    }

    public void turnOffLight(){
        this.lightOff.execute();
    }
}
