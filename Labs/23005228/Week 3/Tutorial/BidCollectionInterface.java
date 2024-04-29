package Tutorial;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 25/3/2024
 * Objective: Q2: Create two interface.
 */

import java.util.List;

/**
 * Interface representing a collection of bids for installing air conditioning units.
 */
public interface BidCollectionInterface {

    /**
     * Adds a bid to this collection.
     *
     * @param bid The bid to be added.
     * @return true if the bid is successfully added, false otherwise.
     * @throws IllegalArgumentException if the bid is null.
     */
    boolean addBid(BidInterface bid);

    /**
     * Returns the bid in this collection with the best yearly cost.
     *
     * @return The bid with the best yearly cost.
     * @throws IllegalStateException if the collection is empty.
     */
    BidInterface getBestYearlyCostBid();

    /**
     * Returns the bid in this collection with the best initial cost.
     * The initial cost is defined as the unit cost plus the installation cost.
     *
     * @return The bid with the best initial cost.
     * @throws IllegalStateException if the collection is empty.
     */
    BidInterface getBestInitialCostBid();

    /**
     * Clears all of the bids from this collection.
     */
    void clearBids();

    /**
     * Gets the number of bids in this collection.
     *
     * @return The number of bids.
     */
    int getNumberOfBids();

    /**
     * Checks whether this collection is empty.
     *
     * @return true if the collection is empty, false otherwise.
     */
    boolean isEmpty();
}
