package com.Momo;

import java.util.ArrayList;

/**
 * Created by Momo Johnson on 8/6/2016.
 */
public class Bank {
    private ArrayList<Branch> branches = new ArrayList<>();


    //A method that adds a branch if it not on file
    public boolean addNewBranch(String brandName){
        Branch branch = findBranch(brandName);
        if(branch == null){
            this.branches.add(new Branch(brandName));
            return true;
        }
        return false;
    }

    //A method that adds a customer transaction if customer is on file
    public boolean existingcustomer(String branchName,String customerName, double customerTransaction){
       Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addTransaction(customerName, customerTransaction);
        }

        return false;

    }

    // A method that adds a new customer to a branched
    public boolean newCustomer(String branchName, String customerName, double customerTransaction){
        Branch branch = this.findBranch(branchName);
            if(branch != null){
                return branch.addNewCustomer(customerName, customerTransaction);
            }
        return false;
    }

    public boolean showList(String branchName, boolean showTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Branch Name: " + branch.getBankName());
            ArrayList<Customers> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customers branchCustomer = branchCustomers.get(i);
                System.out.println(i + 1 + " Name: " + branchCustomer.getCustomerName());

                if (showTransaction == true) {
                    ArrayList<Double> transaction = branchCustomer.getTransaction();
                    for (i = 0; i < transaction.size(); i++) {
                        System.out.println(i + 1 + " Transaction: " + transaction.get(i));
                    }

                }


            }
            return true;
        } else {
            return false;
        }
    }


    private Branch findBranch(String brandName){
        for(int i=0; i<branches.size(); i++){
            Branch branchFound = this.branches.get(i);
            if(branchFound.getBankName().equals(brandName)){
                return this.branches.get(i);
            }
        }
        return null;

    }
}
