package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = getArray(5);
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println(myIntArray[i]);
        }
        System.out.println(getAverage(myIntArray));
    }

    public static int[] getArray(int numbers){
        int[] myIntArray = new int[numbers];

        System.out.println("Enter"+numbers+"numbers\r");

        for (int i=0; i<numbers; i++){
            myIntArray[i] = sc.nextInt();
            }
        return myIntArray;
        }

    public static float getAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        float avg = (float) sum/array.length;

        return avg;
    }

}









