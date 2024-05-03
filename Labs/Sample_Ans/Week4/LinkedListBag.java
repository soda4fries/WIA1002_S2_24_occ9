import java.util.*;

public class LinkedListBag<T> extends AbstractBag<T>{
    private final LinkedList<T> items;

    LinkedListBag() {
        items = new LinkedList<>();
    }

    @Override
    public int getCurrentSize() {
        return items.size();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean add(T newEntry) {
        return items.add(newEntry);
    }

    @Override
    public T remove() {
        return items.remove();
    }

    @Override
    public boolean remove(T anEntry) {
        return items.remove(anEntry);
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int count = 0;
        for (T item: items) {
            if (item.equals(anEntry)) count++;
        }
        return count;
    }

    @Override
    public boolean contains(T anEntry) {
        return items.contains(anEntry);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T[] toArray() {
        return (T[]) items.toArray();
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
