package com.Momo;

import java.util.ArrayList;

/**
 * Created by Momo Johnson on 8/6/2016.
 */
public class Customers {
    private String customerName;
    private ArrayList<Double> transaction;


    public Customers(String customerName, double initialTransaction) {
        this.customerName = customerName;
        this.transaction = new ArrayList<>();
        transaction.add(initialTransaction);
    }

    public void addTransaction(double initialTransaction){
        this.transaction.add(initialTransaction);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }


}
