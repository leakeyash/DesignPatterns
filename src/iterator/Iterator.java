package iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
    void remove(T item);
}
