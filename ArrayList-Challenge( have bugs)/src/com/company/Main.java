package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone Redmi = new MobilePhone("7854541684");

    public static void main(String[] args) {
        boolean quit =false;
        startingPhone();
        printActions();
        while(!quit){
            System.out.println("\n Choose your action: ");
            int actionNum = sc.nextInt();
            switch (actionNum){
                case 0:
                    System.out.println("\n shutting down....");
                    quit =true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    printActions();
                    break;
            }
        }
    }


    private static void printContacts(){
        Redmi.printContacts();
    }
    private static void addNewContact(){
        System.out.println("Enter new name and phoneNumber: ");
        String name = sc.next();
        String phone = sc.next();
        if(Redmi.addNewContact(Contact.createContact(name, phone))){
            System.out.println("Contact "+name+"("+phone+") added");
        }
        else{
            System.out.println("Contact "+name+" already in the Contact List");
        }
    }

    private static void updateContact(){
        System.out.println("You are editing a contact, Enter old Contact name");
        String OldName = sc.next();
        System.out.println("Enter new Contact name");
        String newName = sc.next();
        System.out.println("Enter new Contact PhoneNumber");
        String newPh = sc.next();
        Redmi.updateContact(Redmi.checkContact(OldName), Contact.createContact(newName, newPh));
    }

    private static void removeContact(){
        System.out.println("Removing a contact: ");
        String name =sc.next();
        Redmi.removeContact(name);
    }
    private static void startingPhone(){
        System.out.println("Starting phone.......");
    }

    private static void printActions(){
        System.out.println("\n Available Actions: ");
        System.out.println("\t 0 - to shutdown");
        System.out.println("\t 1 - to printContacts");
        System.out.println("\t 2 - to add a new contact");
        System.out.println("\t 3 - to update an existing contact");
        System.out.println("\t 4 - to remove an existing contact");
        System.out.println("\t 5 - to print the list of Available actions");

    }

}
