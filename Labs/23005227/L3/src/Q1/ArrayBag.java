
package Q1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayBag <T> implements BagInterface <T> {
    private T[] bag;
    private static final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;

    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }
    
    public ArrayBag(int size){
        T[] tempBag = (T[]) new Object[size]; // Unchecked cast
        bag = tempBag;
        numberOfEntries = 0;
    }
    
    public ArrayBag(T[] bag){
        this.bag = bag;
        numberOfEntries = bag.length;
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries == bag.length;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if (isFull()){
            return false;
        } 
        bag[numberOfEntries++] = newEntry;
        return true;
    }

    @Override
    public T remove() {
        int randomIndex = (int) (Math.random() * numberOfEntries);
        T removedElement = bag[randomIndex];
        remove(removedElement);
        return removedElement;
    }

    /*
    public boolean remove(T entry) {
	int index = indexOf(entry);
        return remove(index) == null ? false : true;
    }
    
    T remove(int index) {
        if (index < 0 || index >= this.bag.length || this.isEmpty())
            return null;
	T item = bag[index];
	for (int i = index; i < this.numberOfEntries - 1; i++) {
            bag[i] = bag[i + 1];
	}
	bag[--numberOfEntries] = null;
	return item;
	}
    */

    @Override
    public boolean remove(T anEntry) {
        for (int i=0; i<bag.length; i++){
            if (bag[i].equals(anEntry)){
                bag[i] = bag[numberOfEntries-1];
                bag[numberOfEntries-1] = null;
                numberOfEntries--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(bag, null);
        numberOfEntries = 0;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        for (int i=0; i<bag.length; i++){
            if (bag[i].equals(anEntry)){
                frequency++;
            }
        } return frequency;
    }

    @Override
    public boolean contains(T anEntry) {
        for (int i=0; i<bag.length; i++){
            if (bag[i].equals(anEntry)){
                return true;
            }
        } 
        return false;
        //return getFrequencyOf(anEntry) > 0;
        
        /*
        public boolean contains(T entry) {
            return indexOf(entry) >= 0;
	}

	int indexOf(T entry) {
            // assign bag to Object array because the bag array is of type T[]
            Object[] es = bag;
            // check for reference equality - same memory location
       	    if (entry == null) {
                for (int i = 0; i < numberOfEntries; i++) {
                    if (entry == es[i])
                    return i;
                }
            } else {
		for (int i = 0; i < numberOfEntries; i++) {
                    // check for object equality - same content or state
                    if (entry.equals(es[i]))
		    return i;
		}
            }
            return -1;
	}
        */
    }

    @Override
    public T[] toArray() {
        //type erasure
        T[] arr = (T[]) new Object[numberOfEntries];
        return (T[]) Arrays.copyOf(bag,numberOfEntries);
    }

    @Override
    public BagInterface<T> union(BagInterface<T> another) {
        int size = this.getCurrentSize() + another.getCurrentSize();
        ArrayBag<T> newBag = new ArrayBag<T>(size);

        T[] arr1 = this.toArray();
        for (int i=0; i<arr1.length; i++){
           newBag.add(arr1[i]);
        }
        
        T[] arr2 = another.toArray();
        for (int i=0; i<arr2.length; i++){
            newBag.add(arr2[i]);
        }
        return newBag;
    }
    
    public BagInterface <T> intersection(BagInterface <T> another){
        ArrayBag <T> intersectionBag = new ArrayBag <> ();
        
        T[] arr1 = this.toArray();
        T[] arr2 = another.toArray();
        
        Map <T, Integer> frequencyMap = new HashMap<>();
        for (T element : arr2){
            frequencyMap.put(element, frequencyMap.getOrDefault(element,0) + 1);
        }
        
        for (T element : arr1){
            // checks if the element is not present in the frequency map  or frequency count is zero 
            if (!frequencyMap.containsKey(element) || frequencyMap.get(element) > 0){
                intersectionBag.add(element);            
                frequencyMap.put(element, frequencyMap.get(element)-1);
            }
        }
        return intersectionBag;
    }
    
    public BagInterface <T> difference(BagInterface <T> another){
        ArrayBag <T> differenceBag = new ArrayBag <T>();
        
        Map <T,Integer> frequencyMap = new HashMap<>();
        for (T element : another.toArray()){
            frequencyMap.put(element, frequencyMap.getOrDefault(element,0)+1);
        }
        
        for (T element : this.toArray()){
            // checks if the element is not present in the frequency map  or frequency count is zero 
            if (!frequencyMap.containsKey(element) || frequencyMap.get(element) == 0){
                differenceBag.add(element);
            } else {
                //element occurs in both bags. 
                //frequency count in the map is decremented by one to account for its occurrence in the differenceBag.
                frequencyMap.put(element, frequencyMap.get(element)-1);
            }
        }
        return differenceBag;
    }
 

    
    
}
