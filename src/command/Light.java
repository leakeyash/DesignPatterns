package command;

public class Light {
    private String state="off";
    public void setState(String state){
        this.state = state;
        System.out.println(state);
    }
    public void on(){
        state = "on";
        System.out.println("Light On");
    }

    public void off(){
        state = "off";
        System.out.println("Light Off");
    }
}
