/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package week3;

/**
 *
 * @author Anas Mohammad 23055727
 */
public interface BidInterface {
    
    /**
     * Gets the name of the company making the bid
     * @returns String representing the company making the bid*/
    public String getCompanyName();
    /**
     * Gets the description of the air conditioner that is bidded on
     @returns the String that holds the description of the air conditioner*/
     public String getDescription();
     /**Gets the capacity of the air conditioner unit
      * @returns an int representing the capacity of the AC in tons
      */
     public int getCapacity();
     /** Gets the efficiency of the AC being bidded on
      * @returns an int that holds the efficiency of the air conditioner unit
      */
     public int getEfficiency();
     /** Gets the cost of the AC unit
      * @returns an int of the cost of the AC unit
      */
     public int getCost();
     /** Gets the cost of installation for the air conditioner unit
      * @returns an int that holds the cost of installaion of the air conditioner
      */
     public int getInstallationCost();
     /** Gets the cost of operation of the air conditioner unit
      * @returns an int that hold the yearly cost of operations of the AC
      */
}   

