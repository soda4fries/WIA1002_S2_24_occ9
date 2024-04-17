/**
 * An interface that describes the operations of a bag of objects.
 */
public interface Bag<T> extends Iterable<T> {
    /**
     * Gets the current number of entries in this bag.
     *
     * @return the integer number of entries currently in the bag
     */
    public int getCurrentSize();

    /**
     * Sees whether this bag is full.
     *
     * @return true if the bag is full, or false if not
     */
    public boolean isFull();

    /**
     * Sees whether this bag is empty.
     *
     * @return true if the bag is empty, or false if not
     */
    public boolean isEmpty();

    /**
     * Adds a new entry to this bag.
     *
     * @param newEntry the object to be added as a new entry
     * @return true if the addition is successful, or false if not
     */
    public boolean add(T newEntry);

    /**
     * Removes one unspecified entry from this bag, if possible.
     *
     * @return either the removed entry, if the removal was successful,
     * or null
     */
    public T remove();

    /**
     * Removes one occurrence of a given entry from this bag.
     *
     * @param anEntry the entry to be removed
     * @return true if the removal was successful, or false if not
     */
    public boolean remove(T anEntry);

    /**
     * Removes all entries from this bag.
     */
    public void clear();

    /**
     * Counts the number of times a given entry appears in this bag.
     *
     * @param anEntry the entry to be counted
     * @return the number of times anEntry appears in the bag
     */
    public int getFrequencyOf(T anEntry);

    /**
     * Tests whether this bag contains a given entry.
     *
     * @param anEntry the entry to locate
     * @return true if this bag contains anEntry, or false otherwise
     */
    public boolean contains(T anEntry);

    /**
     * Puts all the elements from other bag to this
     *
     * @param other other bag to add from
     */
    public void addAll(Bag<? extends T> other);

    /**
     * Removes and puts all the element from this bag to other
     *
     * @param other another bag to put in
     */
    public void putAll(Bag<? super T> other);

    /**
     * returns all the elements as array
     *
     * @return array with all the elements
     */
    public T[] toArray();

    /**
     * Returns a new Bag with union of both bag
     *
     * @param other the other bag
     * @return new Bag with union
     */
    public Bag<T> union(Bag<T> other);


    /**
     * Returns a new Bag with intersection of both bag
     *
     * @param other the other bag
     * @return new Bag with intersection
     */
    public Bag<T> intersection(Bag<T> other);


    /**
     * Returns a new Bag with difference this - other
     *
     * @param other the other bag
     * @return new Bag with difference
     */
    public Bag<T> difference(Bag<T> other);

}