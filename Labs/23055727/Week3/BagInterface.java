/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package week3;

/**
 *
 * @author Anas Mohammad 23055727
 */
/**
An interface that describes the operations of a bag of objects.
*/
public interface BagInterface<T> {
    /** Gets the current number of entries in this bag.
        @return the integer number of entries currently in the bag */
    public int getCurrentSize();
    /** Gets the current number of entries in this bag.
        @return the integer number of entries currently in the bag */
    public boolean isFull();
    /** Sees whether this bag is empty.
         @return true if the bag is empty, or false if not */
    public boolean isEmpty();
    /** Adds a new entry to this bag.
        @param newEntry the object to be added as a new entry
        @return true if the addition is successful, or false if not */
    public boolean add(T newEntry);
    /** Removes one unspecified entry from this bag, if possible.
        @return either the removed entry, if the removal was successful,
            or null */
    public T remove();
    /** Removes one occurrence of a given entry from this bag.
        @param anEntry the entry to be removed
        @return true if the removal was successful, or false if not */
    public boolean remove(T anEntry);
    /** Removes all entries from this bag. */
    public void clear();
    /** Counts the number of times a given entry appears in this bag.
        @param anEntry the entry to be counted
        @return the number of times anEntry appears in the bag */
    public int getFrequencyOf (T anEntry);
    /** Tests whether this bag contains a given entry.
        @param anEntry the entry to locate
        @return true if this bag contains anEntry, or false otherwise */
    public boolean contains(T anEntry);
    /** Retrieves all entries that are in this bag.
         @return a newly allocated array of all the entries in the bag */
    public T[] toArray();
    /** Combines two collections of objects
     * @param bag the collection to be combined with the calling object
     * @return a new collection containing the union of two collections*/
    public BagInterface<T> union(BagInterface<T> bag);
    /** Returns a new collection of entries that overlap between the two collections
     *  @param bag the collection to check for overlaps with the calling 
     *   @return a new collection containing the intersection of the two bags*/
    public BagInterface<T> intersection(BagInterface<T> bag);
    /** Returns a new collection of entries that would be left in one collection after removing those that also occur in the other
     *  @param bag the collection to use to take away entries
     *  @return a new collection containing only the entries that appear exclusively in one collection*/
    public BagInterface<T> difference(BagInterface<T> bag);
}
