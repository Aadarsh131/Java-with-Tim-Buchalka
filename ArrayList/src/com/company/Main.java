package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList gl = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit){
            System.out.println("enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    gl.printGrocery();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    System.out.println("Enter the position and the item you would like to add: ");
                    modifyItem(scanner.nextInt(), scanner.next());
                    break;
                case 4:
                    System.out.println("Enter the item-index to remove the item: ");
                    removeItem(scanner.nextInt());
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    System.out.println("Enter the item-name to remove");
                    removeItem(scanner.next());
                    break;
                default:
                    System.out.println("Thankyou for using GroceryApp");
                    quit = true;
                    break;

            }
        }

    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - to print the Instructions");
        System.out.println("\t 1 - to printItems");
        System.out.println("\t 2 - to addItems");
        System.out.println("\t 3 - to modifyItems by position and item-name");
        System.out.println("\t 4 - to removeItems by position");
        System.out.println("\t 5 - to searchItems");
        System.out.println("\t 6 - to removeItems by item-name");
        System.out.println("\t TO EXIT- press any number except(0-5)");
    }

    public static void addItem(){
        System.out.println("Enter item to add ");
        gl.addGrocery(scanner.next());
    }

    public static void modifyItem(int pos, String item){
        gl.modifyGrocery(pos, item);
    }

    public static void removeItem(int pos){
        gl.removeGrocery(pos);
    }

    public static void removeItem(String item){
        gl.removeGrocery(item);
    }

    public static void searchItem(){
        System.out.println("Enter the item to search: ");
        System.out.println(gl.findItem(scanner.next()) +" is found");
    }

    public static void processedArrayList(){
        ArrayList<String> newArrlist = new ArrayList<String>();
        newArrlist.addAll(gl.getGroceryList());

        //below is the another way to copy values of one ArrayList to another
        //ArrayList<String> newArrlist01 = new ArrayList<String>(gl.getGroceryList());

        //below is a way to store ArrayList to an Array
        //String[] myArr = new String[gl.getGroceryList().size()];
        //myArr = gl.getGroceryList().toArray(myArr);


    }

 

}

















