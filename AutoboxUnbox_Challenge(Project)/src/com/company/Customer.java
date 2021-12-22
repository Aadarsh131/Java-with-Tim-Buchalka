package com.company;
import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transaction;

    public Customer(String customerName, double initialAmt){
        this.customerName = customerName;
        this.transaction = new ArrayList<Double>();
        this.transaction.add(initialAmt);
    }

    public void addTransaction(double amt){
        this.transaction.add(amt);
    }

    public String getCustomerName(){
        return customerName;
    }

    public ArrayList<Double> getTransaction(){
        return transaction;
    }


}
