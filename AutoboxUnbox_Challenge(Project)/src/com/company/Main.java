package com.company;

public class Main {

    public static void main(String[] args) {
	/*
        You job is to create a simple banking application.
        There should be a Bank class
        It should have an ArrayList of Branches
        Each Branch should have an ArrayList of Customers
        The Customer class should have an ArrayList of Doubles (transactions)
        Customer:
        Name, and the ArrayList of doubles.
        Branch:
        Need to be able to add a new customer and initial transaction amount.
        Also needs to add additional transactions for that customer/branch
        Bank:
        Add a new branch
        Add a customer to that branch with initial transaction
        Add a transaction for an existing customer for that branch
        Show a list of customers for a particular branch and optionally a list
        of their transactions
        Demonstration autoboxing and unboxing in your code
        Hint: Transactions
        Add data validation.
        e.g. check if exists, or does not exist, etc.
        Think about where you are adding the code to perform certain actions
        */

        Bank SBI = new Bank("SBI");

        SBI.addBranch("Bengdubi");
        SBI.addCustomer("Bengdubi", "Aadarsh", 2000);
        SBI.addCustomer("Bengdubi", "Atul", 7000);
        SBI.addCustomer("Bengdubi", "Anwar", 50000);

        SBI.addBranch("Kolkata");
        SBI.addCustomer("Kolkata", "Aadarsh", 5000);
        SBI.addCustomer("Kolkata", "Jeetendra", 9542);
        SBI.addCustomer("Kolkata", "Suman", 6000);

        SBI.addCustomerTransaction("Bengdubi","Aadarsh", 6000);
        SBI.addCustomerTransaction("Kolkata","Aadarsh", 6945);
        SBI.addCustomerTransaction("Kolkata","Jeetendra", 971);

        SBI.listCustomers("Bengdubi", true);
        SBI.listCustomers("Kolkata", true);






















    }
}
