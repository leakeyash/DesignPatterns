package facade;

public class WorkSimulator {
    public static void main(String[] args){
        Computer computer=new Computer();
        Screen bigScreen = new BigScreen();
        Speaker speaker= new Speaker();
        WorkFacade workFacade=new WorkFacade(computer,bigScreen,speaker);
        workFacade.PrepareToWork();
        workFacade.FinishWork();
    }
}
