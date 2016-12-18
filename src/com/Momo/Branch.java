package com.Momo;

import java.util.ArrayList;

/**
 * Created by Momo Johnson on 8/6/2016.
 */
public class Branch {
    //A List of customers
    private ArrayList<Customers> customers = new ArrayList<>();
    private String bankName;// Bank name
    //Constructor of the bank class
    public Branch(String bankName) {
        this.bankName = bankName;
    }


    //Add a new Customer to a Branch

    public boolean addNewCustomer(String name, double initialAmount){
        Customers newCustomer = findCustomer(name);
        if(newCustomer == null){
            this.customers.add(new Customers(name, initialAmount));
            return true;

        }
        return false;

    }
    //Add existing customer transaction to a branch
    public boolean addTransaction(String name, double transaction){
        Customers existingCustomer = findCustomer(name);
        if(existingCustomer !=null){
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    //Finding a customer of a particular branch
    private Customers findCustomer(String name){
        for(int i=0; i<this.customers.size(); i++){
            Customers customers = this.customers.get(i);
            if(customers.getCustomerName().equals(name)){
                return this.customers.get(i);
            }


        }
        return null;
    }

        //A method that returns list of customers
    public ArrayList<Customers> getCustomers() {
        return customers;
    }

    //A method that returns the name of a branch
    public String getBankName() {
        return bankName;
    }


}
