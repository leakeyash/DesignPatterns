package command;

import java.util.Stack;

public class LightOffCommand implements Command {
    Light light;
    Stack<String> pre = new Stack<>();
    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        pre.push(light.state);
        light.off();
    }

    @Override
    public void undo() {
        if(!pre.empty())
            light.setState(pre.pop());
    }
}
