package command;

import java.util.Stack;

public class LightOnCommand implements Command{

    Light light;
    Stack<String> pre = new Stack<>();
    public LightOnCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        pre.push(light.state);
        light.on();
    }

    @Override
    public void undo() {
        if(!pre.empty())
            light.setState(pre.pop());
    }
}
