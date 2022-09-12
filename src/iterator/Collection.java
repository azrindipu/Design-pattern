package iterator;

import java.util.ArrayList;
import java.util.List;

public class Collection implements Iterable {

    private List<Integer> list;

    public Collection() {
        this.list = new ArrayList<>();
    }

    public void addItem(int item){
        list.add(item);
    }

    public void removeItem(int item){
        list.remove(item);
    }

    public List<Integer> getList() {
        return list;
    }

    @Override
    public Iterator getIterator() {
        return new CollectionIterator(this);
    }
}
