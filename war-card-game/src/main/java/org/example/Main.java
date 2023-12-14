package org.example;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //create the cards values (
        String[] cardValues = new String[13];
        for (int i = 0; i < cardValues.length; i++) {
            int value = i + 1;
            if (i + 1 == 1){
                cardValues[i] = "Ace";
            } else if (i + 1 <= 10) {
                cardValues[i] = Integer.toString(value);
            } else if (i + 1 == 11) {
                cardValues[i] = "Jack";
            } else if (i + 1 == 12) {
                cardValues[i] = "Queen";
            } else if (i + 1 == 13) {
                cardValues[i] = "King";
            }
        }
        //ask if user wants to play
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to play a game? ");
        String userInput = input.nextLine();

        //explain the game
        if (userInput.equalsIgnoreCase("yes")) {
            System.out.println("Great! Here's how it goes: I pick up a card, you pick up a card, we both lay them down. The winner is the one with the highest card! If we have the same value, we just draw.");

            //create computer's card
            int computerCard = createCard();
            System.out.println("My card is " + cardValues[computerCard] + ".");

            //create user's card
            int userCard = createCard();
            System.out.println("Your card is " + cardValues[userCard] + ".");

            //compare the two and declare the winner
            if (computerCard > userCard){
                System.out.println("Oh no! Looks like I won.");
            } else if (userCard > computerCard){
                System.out.println("Hey! Looks like you won!");
            } else {
                System.out.println("Well, looks like we draw.");
            }

        } else {
            System.out.println("Oh well, thanks anyways.");
        }


    }
    public static int createCard() {
        Random rand = new Random();
        int upperBound = 13;
        int card = rand.nextInt(upperBound);

        return card;
    }
}