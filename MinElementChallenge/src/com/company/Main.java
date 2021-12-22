package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter How many item?");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        System.out.println(Arrays.toString(array));
        System.out.println(findMin(array));
    }

    public static int[] readIntegers(int count){
        int[] arr = new int[count];
        for(int i=0; i<arr.length; i++){
            arr[i]= scanner.nextInt();
        }
        return arr;
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
