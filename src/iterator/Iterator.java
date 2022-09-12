package iterator;

public interface Iterator {
    boolean hasNext();
    void nextItem();
    Object getCurrentItem();
}
