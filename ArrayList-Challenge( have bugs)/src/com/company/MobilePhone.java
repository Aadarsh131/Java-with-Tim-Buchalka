package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String randNum;
    private static ArrayList<Contact> myContacts;

    public MobilePhone(String randNum) {
        this.randNum = randNum;
        this.myContacts = new ArrayList<Contact>();
    }

    public Boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
//            System.out.println("Contact already in the List");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public void updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) >= 0) {
            this.myContacts.set(this.myContacts.indexOf(oldContact), newContact);
            System.out.println("Old Contact of" + oldContact.getName() + " is replaced with " + newContact.getName());
        } else {
            System.out.println("Old contact not found");
        }
    }


    public void removeContact(String name) {
//        if(findContact(contact)>=0){
//            this.myContacts.remove(myContacts.indexOf(contact));
//            System.out.println("Successfully removed ->"+contact.getName()+"<- from the contacts");
//        }
//        else{
//            System.out.println("Contact already not present!");
//        }
        int pos = findContact(name);
        if (pos >= 0) {
            this.myContacts.remove(pos);
            System.out.println("Successfully removed ->" + this.myContacts.get(pos).getName() + "<- from contacts");
        } else {
            System.out.println("Contact is already not present");
        }
    }


    public int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }


    public int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName() == name) {
                return i;
            }
        }
        return -1;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + "->" + this.myContacts.get(i).getName() + "(" + this.myContacts.get(i).getPhoneNumber() + ")");
        }
    }

    public Contact checkContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName() == name) {
                return contact;
            }
        }
        return null;


    }
}
