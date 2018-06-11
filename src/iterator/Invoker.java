package iterator;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Life> lives = new ArrayList<Life>();
    public Invoker(Life... life){
        for(Life l:life){
            lives.add(l);
        }
    }

    public void Iterator(){
        for(Life l:lives){
            Iterator iterator = l.createIterator();
            while (iterator.hasNext()){
                System.out.print(iterator.next());
            }
        }
    }
}
