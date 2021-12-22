package com.company;

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer(40,true);
        System.out.println(printer.getNo_of_pages_printed());
        printer.printPages(45);
        System.out.println(printer.getNo_of_pages_printed());
        System.out.println(printer.filltoner(50));
    }
}
