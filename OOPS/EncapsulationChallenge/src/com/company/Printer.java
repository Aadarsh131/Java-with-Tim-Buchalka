package com.company;

public class Printer {
    private int tonerLevel;
    private int no_of_pages_printed;
    private boolean duplex_printer;

    public Printer(int tonerLevel, boolean duplex_printer) {
        if(tonerLevel >-1 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.duplex_printer = duplex_printer;
        this.no_of_pages_printed = 0;
    }

    public int filltoner(int tonerAmt){
        if(tonerAmt >0 && tonerAmt <=100){
            if(tonerAmt + this.tonerLevel > 100){
                return -1;
            }
            this.tonerLevel += tonerAmt;
            return this.tonerLevel;
        }else{
            return -1;
        }

    }

    public int printPages(int pages){
        this.no_of_pages_printed += pages;
        return no_of_pages_printed;
    }

    public int getNo_of_pages_printed() {
        return no_of_pages_printed;
    }
}
