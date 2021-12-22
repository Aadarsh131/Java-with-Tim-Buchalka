package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	    ArrayList<Integer> aadarsh = new ArrayList<Integer>(); //OR make your own IntClass instead of Integer wrapper class

        aadarsh.add(Integer.valueOf(45));
        System.out.println(aadarsh.get(0).intValue());

        Integer x = 50; // Integer.valueOf(50)
        int y = x; //x.intValue()
        System.out.println(y);

        ArrayList<Double> atul = new ArrayList<Double>();
        for(double i=0.0; i<10.0; i++){
            atul.add(Double.valueOf(i)); // atul.add(i) will work too, as java has prodided us with shortcuts
        }
        for(int i=0; i<10; i++){
            System.out.println(i+"-->"+atul.get(i).doubleValue()); // atul.get(i) will work too, as java has prodided us with shortcuts
        }
    }
}


//        Integer x = new Integer(33); //OR Integer.valueOf(33) //OR simply, Integer x = 33;(this is shortcut)
//        aadarsh.add(x);
