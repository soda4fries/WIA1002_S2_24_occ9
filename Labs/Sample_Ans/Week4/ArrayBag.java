import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayBag<T> extends AbstractBag<T> {
    //yay saving 32 bit
    private static final int DEFAULT_CAPACITY = 100;

    private T[] items;
    private int top;

    ArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    ArrayBag(int Capacity) {
        items = (T[]) new Object[Capacity];
        top = 0;
    }

    private void swap(int x, int y) {
        T copy = items[x];
        items[x] = items[y];
        items[y] = copy;
    }

    @Override
    public int getCurrentSize() {
        return top;
    }

    @Override
    public boolean isFull() {
        return top == items.length;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if (isFull()) return false;
        items[top++] = newEntry;
        return true;
    }

    @Override
    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T copy = items[top - 1];
        items[top-1] = null;
        top--;
        return copy;
    }


    @Override
    public boolean remove(T anEntry) {
        if (isEmpty()) return false;
        for (int i = 0; i < top; i++) {
            if (items[i].equals(anEntry)) {
                top--;
                swap(i, top);
                items[top] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        if (isEmpty()) return 0;
        int count = 0;
        for (int i = 0; i < top; i++) {
            if (items[i].equals(anEntry)) count++;
        }
        return count;
    }

    @Override
    public boolean contains(T anEntry) {
        return getFrequencyOf(anEntry) != 0;
    }

    @Override
    public T[] toArray() {
        return items.clone();
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayBagIterator();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private class ArrayBagIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < top;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return items[currentIndex++];
        }
    }
}
