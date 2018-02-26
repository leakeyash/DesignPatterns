package command;

public class SimpleClient {
    public static void main(String[] args){
        Light light=new Light();
        LightOnCommand lightOnCommand=new LightOnCommand(light);
        LightOffCommand lightOffCommand=new LightOffCommand(light);
        Invoker invoker=new Invoker();
        invoker.setCommand(lightOnCommand);
        invoker.execute();
        invoker.setCommand(lightOffCommand);
        invoker.execute();
        invoker.execute();
        invoker.execute();

        invoker.undo();
        invoker.undo();
        invoker.undo();
    }
}
