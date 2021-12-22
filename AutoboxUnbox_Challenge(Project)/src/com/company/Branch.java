package com.company;
import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName ){
        this.branchName=branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName(){
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String custname, double initialAmt){
        if(findCustomer(custname) == null){
            this.customers.add(new Customer(custname, initialAmt));
            return true;
        }
        return false;

    }

    public boolean addTransaction(String custname, double amt){
        if(findCustomer(custname) != null){
            findCustomer(custname).addTransaction(amt);
            return true;
        }
        return false;
    }

    public Customer findCustomer(String custname){
        ArrayList<Customer> customers = this.customers;
        for(int i=0; i<customers.size(); i++){
            Customer customer = customers.get(i);
            if((customer.getCustomerName()).equals(custname)){
                return customer;
            }
        }
        return null;

    }
}
