package com.Momo;

import java.util.ArrayList;

/**
 * Created by Momo Johnson on 8/6/2016.
 */
public class Customers {
    private String customerName;
    private ArrayList<Double> transaction;

    // A constructor that initializes the various variable
    public Customers(String customerName, double initialTransaction) {
        this.customerName = customerName;
        this.transaction = new ArrayList<>();
        transaction.add(initialTransaction);
    }
    //A method that adds the customer transaction
    public void addTransaction(double initialTransaction){
        this.transaction.add(initialTransaction);
    }
    //A method that gets the customer name
    public String getCustomerName() {
        return customerName;
    }
    // A method that returns the transaction of a particular customer
    public ArrayList<Double> getTransaction() {
        return transaction;
    }


}
