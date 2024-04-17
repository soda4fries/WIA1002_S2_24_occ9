
package Q2;

public interface BidCollectionInterface <E extends BidInterface> {
    //Adds a bid to this collection.
    //@param bid The bid to be added.
    public void addBid(E bid);
    
    //Returns the bid in this collection with the best yearly cost.
    //@return The bid with the best yearly cost.
    public double bestYearlyCost();
    
    //Returns the bid in this collection with the best initial cost.
    //The initial cost will be defined as the unit cost plus the installation cost.
    //@return The bid with the best initial cost.
    public double bestInitialCost();
    
    //Clears all of the bids from this collection.
    public void clear();
    
    //Gets the number of bids in this collection.
    //@return The number of bids in this collection.
    public int getNoOfItems();
    
    //Checks whether this collection is empty.
    //@return True if this collection is empty, false otherwise.
    public boolean isEmpty();

    
}
