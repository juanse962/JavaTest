package com.example.javatest.player;

public class Player {
    private final Dice dice;
    private final int miNumber;

    public Player(Dice dice, int miNumber) {
        this.dice = dice;
        this.miNumber = miNumber;
    }

    public boolean play(){
        int diceNumber = dice.roll();

        return diceNumber > miNumber;
    }
}
