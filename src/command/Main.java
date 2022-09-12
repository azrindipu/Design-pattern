package command;

public class Main {
    public static void main(String[] args){
        Light light = new LightImpl();
        Command onCommand = new LightOnCommandImpl(light);
        Command offCommand = new LightOffCommandImpl(light);
        Invoker invoker = new Invoker(onCommand, offCommand);
        invoker.turnOnLight();
        invoker.turnOffLight();
    }
}
