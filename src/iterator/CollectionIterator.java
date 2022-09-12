package iterator;

public class CollectionIterator implements Iterator {

    private Collection collection;
    private int index=0;

    public CollectionIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.getList().size();
    }

    @Override
    public void nextItem() {
        index++;
    }

    @Override
    public Object getCurrentItem() {
        return collection.getList().get(index);
    }
}
