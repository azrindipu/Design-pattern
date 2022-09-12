package iterator;

public class Main {
    public static void main(String[] args){
        Collection collection = new Collection();
        collection.addItem(1);
        collection.addItem(2);
        collection.addItem(3);
        collection.addItem(4);
        collection.addItem(5);

        Iterator iterator = collection.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getCurrentItem());
            iterator.nextItem();
        }
    }
}
