package com.company;
import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branch;

    public Bank(String bankName){
        this.bankName = bankName;
        this.branch = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branch.add(new Branch(branchName));
            return true;
        }
        System.out.println("Branch already present");
        return false;
    }

    public boolean addCustomer(String branchName, String custName, double amt){
        Branch branch = findBranch(branchName);
        if( branch != null){
            return branch.newCustomer(custName, amt);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String custName, double amt){
        Branch checkBranch = findBranch(branchName);
        if(checkBranch != null){
            if(checkBranch.addTransaction(custName, amt)){
                return true;
            }
        }
        return false;
    }

    public void listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            ArrayList<Customer> customers = branch.getCustomers();
            for(int i=0; i<customers.size(); i++){
                Customer customer = customers.get(i);

                if(showTransactions){
                    System.out.println((i+1)+"--> "+customer.getCustomerName()+" --> "+customer.getTransaction());
                }
                else{
                    System.out.println((i+1)+"--> "+customer.getCustomerName());
                }
            }

        }
    }


    private Branch findBranch(String branchName){
        ArrayList<Branch> bra = this.branch;
        for(int i=0; i<bra.size(); i++){
            Branch branch1 = bra.get(i);
            if(branch1.getBranchName().equals(branchName)){
                return branch1;
            }
        }
        return null;
    }
}
