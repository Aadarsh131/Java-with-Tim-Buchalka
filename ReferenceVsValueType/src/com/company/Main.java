package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Array, String is a Reference type
    // int, float, is a Value type

        int a= 10;
        int copyOfa = a;
        copyOfa++;
        System.out.println(a);
        System.out.println(copyOfa); // only this got incremented (as Int is Value type)

        int[] arr= new int[5];
        int[] CopyOfarr = arr;
        CopyOfarr[3]=9;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(CopyOfarr)); // both arr & copyOfarr got changed(as it is ref type)


        //DeReferrencing
        CopyOfarr = new int[]{1,2,3,4,5,5,6,6,8};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(CopyOfarr));//we dereferrenced the COpyOfarr array from the same memory
    }
}
