/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;


/**
 *
 * @author Anas Mohammad 23055727
 */
public class ArrayBag<T> implements BagInterface<T>{
    T[] bag;
    final int  DEFAULT_CAPACITY = 25;
    int numberOfEntries;
    
    @SuppressWarnings("unchecked")
    ArrayBag(){
        bag = (T[])new Object[DEFAULT_CAPACITY];
        numberOfEntries = 0;
    }
    @SuppressWarnings("unchecked")
    ArrayBag(T[] bag){
        this.bag =(T[])new Object[DEFAULT_CAPACITY];
        int count = 0;
        for (T item : bag)
            if (item != null)
                this.bag[count++] = item;
        numberOfEntries = count;
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        for (T item : bag)
            if (item == null)
                return false;
        return true;
    }

    @Override
    public boolean isEmpty() {
        for (T item : bag)
            if (item != null)
                return false;
        return true;    
    }

    @Override
    public boolean add(T newEntry) {
        for (int i = 0; i < DEFAULT_CAPACITY; i++)
            if (bag[i] == null){
                bag[i] = newEntry;
                numberOfEntries++;
                return true;
            }
        return false;
    }

    @Override
    public T remove() {
        for (int i = 0; i < DEFAULT_CAPACITY; i++)
            if (bag[i] != null){
                T t = bag[i];
                bag[i] = null;
                numberOfEntries--;
                return t;
            }
        return null;
    }

    @Override
    public boolean remove(T anEntry) {
        for (int i = 0; i < DEFAULT_CAPACITY; i++)
            if (bag[i].equals(anEntry)){
                bag[i] = null;
                numberOfEntries--;
                return true;
            }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < DEFAULT_CAPACITY; i++){
            bag[i] = null;
        }
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int count = 0;
        for (T item : bag)
            if (item.equals(anEntry))
                count++;
        return count;
    }

    @Override
    public boolean contains(T anEntry) {
        for (T item : bag)
            if (item.equals(anEntry))
                return true;
        return false;
    }

    @Override
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] array = (T[]) new Object[getCurrentSize()];
        int j = 0;
        for (int i = 0; i < DEFAULT_CAPACITY; i++)
            if (bag[i] != null)
                array[j++] = bag[i];
        return array;
    }

    @Override
    public BagInterface<T> union(BagInterface<T> bag) {
        BagInterface<T> returnedBag = new ArrayBag<>();
        for (int i = 0; i < DEFAULT_CAPACITY; i++)
            if (this.bag[i] != null){
                returnedBag.add(this.bag[i]);
            }
        T[] tempBag = bag.toArray();
        for (int i = 0; i < bag.getCurrentSize(); i++)
            if(tempBag[i] != null)
                returnedBag.add(tempBag[i]);
        
        return returnedBag;
    }
    
    @Override
    public BagInterface<T> intersection(BagInterface<T> bag) {
        BagInterface<T> returnedBag = new ArrayBag<>();
        T[] copyBag = this.toArray();
        T[] otherBag = bag.toArray();
        
        OuterLoop:
        for (int i = 0; i < getCurrentSize(); i++){
            for (int j = 0; j < bag.getCurrentSize(); j++){
                if (copyBag[i].equals(otherBag[j])){
                    returnedBag.add(copyBag[i]);
                    copyBag[i] = null;
                    otherBag[j] = null;
                    continue OuterLoop;
                }
            }
        }
        
        return returnedBag;
    }
    @Override
    public BagInterface<T> difference(BagInterface<T> bag) {
        T[] newBag = toArray();
        T[] tempBag = bag.toArray();
        int x = getCurrentSize();
        int y = bag.getCurrentSize();
        OuterLoop:
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                if (newBag[i].equals(tempBag[j])){
                    newBag[i] = null;
                    tempBag[j] = null;
                    continue OuterLoop;
                }
            }
        }
        tempBag = null;
        BagInterface<T> returnedBag = new ArrayBag<>(newBag);
        return returnedBag;
    }
}
