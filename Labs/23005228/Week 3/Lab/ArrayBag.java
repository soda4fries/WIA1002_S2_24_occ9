package Lab;

import java.util.Arrays;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 25/3/2024
 * Objective: Create ArrayBag class implements BagInterface.
 */

import java.util.Arrays;

public class ArrayBag<T> implements BagInterface<T> {
    private final T[] bag;
    private static final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;

    public ArrayBag() {
        bag = (T[]) new Object[DEFAULT_CAPACITY];
        numberOfEntries = 0;
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries == DEFAULT_CAPACITY;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if (isFull())
            return false;
        bag[numberOfEntries] = newEntry;
        numberOfEntries++;
        return true;
    }

    @Override
    public T remove() {
        if (isEmpty())
            return null;
        T removedItem = bag[numberOfEntries - 1];
        bag[numberOfEntries - 1] = null;
        numberOfEntries--;
        return removedItem;
    }

    @Override
    public boolean remove(T anEntry) {
        int index = getIndexOf(anEntry);
        if (index == -1)
            return false;
        else {
            removeEntry(index);
            return true;
        }
    }

    private int getIndexOf(T anEntry) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (bag[i].equals(anEntry))
                return i;
        }
        return -1;
    }

    private void removeEntry(int index) {
        bag[index] = bag[numberOfEntries - 1];
        bag[numberOfEntries - 1] = null;
        numberOfEntries--;
    }

    @Override
    public void clear() {
        while (!isEmpty())
            remove();
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        for (int i = 0; i < numberOfEntries; i++) {
            if (bag[i].equals(anEntry))
                frequency++;
        }
        return frequency;
    }

    @Override
    public boolean contains(T anEntry) {
        return getIndexOf(anEntry) != -1;
    }

    @Override
public T[] toArray() {
    // Use Arrays.copyOf method to create a new array of strings
    // Cast each element to string
    String[] result = new String[numberOfEntries];
    for (int i = 0; i < numberOfEntries; i++) {
        result[i] = (String) bag[i];
    }
    return (T[]) result;
}


    @Override
    public BagInterface<T> union(BagInterface<T> anotherBag) {
        BagInterface<T> result = new ArrayBag<>();
        for (T item : bag) {
            if (item != null) {
                result.add(item);
            }
        }
        for (T item : anotherBag.toArray()) {
            if (item != null) {
                result.add(item);
            }
        }
        return result;
    }


    @Override
    public BagInterface<T> intersection(BagInterface<T> anotherBag) {
        BagInterface<T> result = new ArrayBag<>();
        for (T item : bag) {
            if (anotherBag.contains(item) && !result.contains(item)) {
                int freqInBag1 = getFrequencyOf(item);
                int freqInBag2 = anotherBag.getFrequencyOf(item);
                int minFreq = Math.min(freqInBag1, freqInBag2);
                for (int i = 0; i < minFreq; i++) {
                    result.add(item);
                }
            }
        }
        return result;
    }

    @Override
    public BagInterface<T> difference(BagInterface<T> anotherBag) {
        BagInterface<T> result = new ArrayBag<>();
        for (T item : bag) {
            int freqInBag1 = getFrequencyOf(item);
            int freqInBag2 = anotherBag.getFrequencyOf(item);
            int diffFreq = freqInBag1 - freqInBag2;
            if (diffFreq > 0 && !result.contains(item)) { // Ensure unique items
                for (int i = 0; i < diffFreq; i++) {
                    result.add(item);
                }
            }
        }
    return result;
    }

}