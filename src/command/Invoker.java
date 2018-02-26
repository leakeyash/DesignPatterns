package command;

public class Invoker {

    Command command;
    public Invoker(){
        command = new NoCommand();
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void execute(){
        command.execute();
    }
    public void undo(){
        command.undo();
    }
}
