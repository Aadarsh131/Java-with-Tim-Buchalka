package com.company;

public class Main {

    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("atul", 30, "sword");
        System.out.println("initialized health is"+ player.getHealth());
        player.loseHealth(10);
        System.out.println("initialized health is"+ player.getHealth());

    }
}
