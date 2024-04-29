package Tutorial;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 25/3/2024
 * Objective: Q2: Create two interface.
 */

/**
 * Interface representing a single bid for installing an air conditioning unit.
 */
public interface BidInterface {
    
    /**
     * Returns the name of the company making this bid.
     * 
     * @return The name of the company.
     */
    String getCompanyName();
    
    /**
     * Returns the description of the air conditioner that this bid is for.
     * 
     * @return The description of the air conditioner.
     */
    String getDescription();
    
    /**
     * Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
     * 
     * @return The capacity of the air conditioner.
     */
    double getCapacity();
    
    /**
     * Returns the seasonal efficiency of this bid's AC (SEER).
     * 
     * @return The seasonal efficiency of the air conditioner.
     */
    double getSEER();
    
    /**
     * Returns the cost of this bid's AC.
     * 
     * @return The cost of the air conditioner.
     */
    double getUnitCost();
    
    /**
     * Returns the cost of installing this bid's AC.
     * 
     * @return The cost of installation.
     */
    double getInstallationCost();
    
    /**
     * Returns the yearly cost of operating this bid's AC.
     * 
     * @return The yearly cost of operating the air conditioner.
     */
    double getYearlyOperatingCost();
}
