package iterator;

import java.util.Stack;

public class MoneyIterator implements Iterator{
    private Stack<Integer> money;
    public MoneyIterator(){
        money = new Stack<Integer>();
        money.push(2700);
        money.push(8800);
        money.push(18000);
        money.push(20000);
    }
    @Override
    public boolean hasNext() {
        return !money.empty();
    }

    @Override
    public Object next() {
        return money.pop();
    }

    @Override
    public void remove(Object item) {
        throw new UnsupportedOperationException();
    }
}
