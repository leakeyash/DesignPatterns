package iterator;

import java.util.Random;

public class love implements Iterator{
    private Random random;
    public love(){
        random = new Random();
    }
    @Override
    public boolean hasNext() {
        return random.nextInt(100)==88;
    }

    @Override
    public Object next() {
        return random.nextInt(99999999);
    }

    @Override
    public void remove(Object item) {
        throw new UnsupportedOperationException("");
    }
}
