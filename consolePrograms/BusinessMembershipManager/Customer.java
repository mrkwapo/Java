package com.Dracodess;

/**
 * Created by Nate Kwapo 3/21/2020
 * This Class is responsible for tracking Customer ids, names, membership and fees
 */
public class Customer {
    // we want to restrict access of these fields from outside Customer Class
    private int id;
    private String name;
    private int membershipLevel;
    private int feesPaid;
    private int feesTotal;

    /**
     * Constructor to initialize a Customer Object
     * @param id unique id for each customer
     * @param name name for each customer
     * @param membershipLevel level of membership of each customer
     */
    public Customer(int id, String name, int membershipLevel){
        this.feesPaid = 0;
        this.feesTotal = 200;
        this.id = id;
        this.name = name;
        this.membershipLevel = membershipLevel;

    }

    //Not going to alter Customer name, students, id.

    /**
     * Used to update a Customer's Membership Level
     * @param membershipLevel new membership level of Customer
     */
    public void setMembershipLevel(int membershipLevel){
        this.membershipLevel = membershipLevel;
    }

    /**
     * Pays the selected amount as fees to the Business
     * @param fees fees that the Customer pays
     */
    public void payFees(int fees){
        feesPaid += fees;
        Business.updateTotalMoneyEarned(fees);

    }

    /**
     *
     * @return id of Customer
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of Customer
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return membership level of Customer
     */
    public int getMembershipLevel() {
        return membershipLevel;
    }

    /**
     *
     * @return  fees that have been paid by Customer
     */
    public int getFeesPaid() {
        return feesPaid;
    }


    /**
     *
     * @return total fees of Customer
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * Return the remainin fees
     * @return
     */
    public int getRemaininfFees() {
        return feesTotal - feesPaid;
    }
    @Override
    public String toString() {
        return "Customer's name: " + name +
                " Total fees paid so far $" + feesPaid;
    }


}
