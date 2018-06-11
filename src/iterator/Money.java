package iterator;

public class Money implements Life{
    @Override
    public Iterator createIterator() {
        return new MoneyIterator();
    }
}
