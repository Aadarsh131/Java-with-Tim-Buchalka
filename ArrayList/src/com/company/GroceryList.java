package com.company;

import java.util.ArrayList;

public class GroceryList {
    public static ArrayList<String> groceryList = new ArrayList<String>();

    public static ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public static void addGrocery(String item){
        groceryList.add(item.toLowerCase());
    }

    public static void printGrocery(){
        for(int i = 0; i< groceryList.size(); i++){
            System.out.println("Item No. " +(i+1)+" --> "+groceryList.get(i));
        }
    }


    public static void modifyGrocery(int position, String item){
        groceryList.set(position,item.toLowerCase());
        System.out.println("Modified item: "+item.toLowerCase()+" on index "+position);
    }

    public static void removeGrocery(String item){
        int position = findItem(item.toLowerCase());
        if(position >= 0){
            removeGrocery(position);
//            System.out.println("Removed item: "+item.toLowerCase()+" on index "+position);
        }
        else{System.out.println("Item not in the List");}
    }
    public static void removeGrocery(int position){
        String item = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Removed item: "+item+" on index "+position);
    }

    public static int findItem(String searchItem){
//        boolean isContaining = groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem.toLowerCase());


    }
}
