package iterator;

public class WorkIterator implements Iterator{
    private String[] works;
    private int position;
    public WorkIterator(){
        works = new String[]{"victorysoft","pactera","citigroup"};
        position=-1;
    }
    @Override
    public boolean hasNext() {
        return position+1>=0&&position+1<works.length;
    }

    @Override
    public Object next() {
        position++;
        return works[position];
    }

    @Override
    public void remove(Object item) {
        throw new UnsupportedOperationException();
    }
}
