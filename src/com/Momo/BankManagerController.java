package com.Momo;

public class BankManagerController {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addNewBranch("AccessBank");
        bank.addNewBranch("Australia Bank");
        bank.newCustomer("AccessBank", "Tim", 45.00);
        bank.existingcustomer("AccessBank", "Tim", 34.00);
        bank.newCustomer("Australia Bank", "James", 67.00);
        bank.existingcustomer("Australia Bank",  "James", 67.00);
        bank.existingcustomer("Australia Bank", "James", 100.00);

        bank.showList("Australia Bank", true);


       bank.showList("AccessBank", true);


    }
}
