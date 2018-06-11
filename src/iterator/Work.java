package iterator;

public class Work implements Life{
    @Override
    public Iterator createIterator() {
        return new WorkIterator();
    }
}
