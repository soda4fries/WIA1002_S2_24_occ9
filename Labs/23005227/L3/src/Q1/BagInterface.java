/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q1;

/**
An interface that describes the operations of a bag of objects. */
public interface BagInterface<T>
{
    /** Gets the current number of entries in this bag.
    @return the integer number of entries currently in the bag */
    public int getCurrentSize();
    /** Sees whether this bag is full.
    @return true if the bag is full, or false if not */
    public boolean isFull();
    /** Sees whether this bag is empty.
    @return true if the bag is empty, or false if not */
    public boolean isEmpty();
    /** Adds a new entry to this bag.
    @param newEntry the object to be added as a new entry @return true if the addition is successful, or false if not */
    public boolean add(T newEntry);
    /** Removes one unspecified entry from this bag, if possible. @return either the removed entry, if the removal was successful,
    or null */ public T remove();
    /** Removes one occurrence of a given entry from this bag.
    @param anEntry the entry to be removed
    @return true if the removal was successful, or false if not */
    public boolean remove(T anEntry);
    /** Removes all entries from this bag. */
    public void clear();
    /** Counts the number of times a given entry appears in this bag. @param anEntry the entry to be counted
    @return the number of times anEntry appears in the bag */
    public int getFrequencyOf(T anEntry);
    /** Tests whether this bag contains a given entry.
    @param anEntry the entry to locate
    @return true if this bag contains anEntry, or false otherwise */
    public boolean contains(T anEntry);
    /** Retrieves all entries that are in this bag.
        @return a newly allocated array of all the entries in the bag */ 
    public T[] toArray();
    /** Combines the contents of this bag with the contents of another bag to form a new bag.
        * Neither this bag nor the other bag are modified by this operation. 
    @param otherBag The other bag to be combined with this bag.
    @return A new bag containing the union of the elements from this bag and the other bag.*/
    public BagInterface <T> union(BagInterface <T> another);
    /** Returns a new bag containing the intersection of this bag and another bag.
    * The intersection of two bags contains the entries that occur in both bags.
    * Duplicate entries in either bag are counted separately.
    * @param another The other bag with which to find the intersection.
    * @return A new bag containing the intersection of this bag and another bag. */
    public BagInterface <T> intersection(BagInterface<T> another);
    /** Returns a new bag containing the difference of this bag and another bag.
    * The difference of two bags contains the entries that occur in the first bag
    * after removing those that also occur in the second bag.
    * Duplicate entries in the first bag are counted separately.
    * @param another The other bag from which to remove the common entries.
    * @return A new bag containing the difference of this bag and another bag. */
    public BagInterface <T> difference(BagInterface <T> another);
} // end BagInterface
