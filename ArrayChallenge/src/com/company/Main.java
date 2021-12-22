package com.company;
import java.util.Scanner;
public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    System.out.println("Enter the no. of items");
    int number = scanner.nextInt();
    int[] myArray = getIntegers(number);
    printArray(myArray);
    int[] sortedArray = sortIntegers(myArray);
    for(int i=0; i<sortedArray.length; i++){
        System.out.println(sortedArray[i]);
        }

    }

    public static int[] getIntegers(int numbers){
        int[] myArray = new int[numbers];

        for(int i=0; i<numbers; i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static void printArray(int[] myArray){
        for(int i=0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int temp;
        boolean flag = true;

        while (flag){ //algo to sort the array
            flag= false;
            for(int i=0; i<array.length-1; i++){
                if(array[i] < array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag= true;
                }
            }
        }
        return array;
    }
}















