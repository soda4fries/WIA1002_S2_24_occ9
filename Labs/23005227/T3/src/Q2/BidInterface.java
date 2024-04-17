
package Q2;

public interface BidInterface {


    //Returns the name of the company making this bid.
    //@return The name of the company making this bid.    
    public String name();
    
    
    //Returns the description of the air conditioner that this bid is for.
    //@return The description of the air conditioner.
    public String description();
    
    //Returns the capacity of this bid's air conditioner in tons.
    //(1 ton = 12,000 BTU)
    //@return The capacity of the air conditioner in tons.
    public int capacity();
    
    //Returns the seasonal efficiency of this bid's air conditioner (SEER).
    //@return The seasonal efficiency of the air conditioner.
    public double efficiency();
    
    
    //Returns the cost of this bid's air conditioner.
    //@return The cost of the air conditioner.
    public double costOfBid();
    
    //Returns the cost of installing this bid's air conditioner.
    //@return The cost of installing the air conditioner.
    public double costOfInstalling();
    
    //Returns the yearly cost of operating this bid's air conditioner.
    //@return The yearly cost of operating the air conditioner.
    public double costOfOperating();
    
    
    
    
    
}
