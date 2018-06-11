package iterator;

public class Simulator {
    public static void main(String[] args){
        Money m =new Money();
        Work w = new Work();
        Invoker invoker = new Invoker(m,w);
        invoker.Iterator();
    }
}
