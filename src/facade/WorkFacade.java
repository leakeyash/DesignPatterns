package facade;

public class WorkFacade {
    Computer computer;
    Screen screen;
    Speaker speaker;
    public WorkFacade(Computer computer,Screen screen,Speaker speaker){
        this.computer = computer;
        this.screen = screen;
        this.speaker = speaker;
    }

    public void PrepareToWork(){
        computer.awake();
        screen.on();
        speaker.on();
    }

    public void FinishWork(){
        computer.sleep();
        screen.off();
        speaker.off();
    }
}
