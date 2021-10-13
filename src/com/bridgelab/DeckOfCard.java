package com.bridgelab;
/*Setup the initial game with deck of cards and make sure we have unique cards,
*The number of cards are 52. Should be able to make unique deck.
*Maintain the ranks to further compare
* */
import java.util.Random;
public class DeckOfCard {
        public static void main(String[] args) {
            int[] TotDeck = new int[52];
            //Welcome message
            System.out.println("**Welcome to DeckOfCard**");
            //declaring  string for the different cards
            String[] cards = {"Spades", "Hearts", "Diamonds", "Clubs"};
            //Declaring String rank for maintaining order of cards
            String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

            // Initialize cards
            for (int i = 0; i < TotDeck.length; i++) {
                TotDeck[i] = i;
            }

            // Shuffle the cards
            for (int i = 0; i < TotDeck.length; i++) {
                int index = (int)(Math.random() * TotDeck.length);
                int temp = TotDeck[i];
                TotDeck[i] = TotDeck[index];
                TotDeck[index] = temp;
            }

            // Display all the cards in the rank
            for (int i = 0; i < 52; i++) {
                String suit = cards[TotDeck[i] / 13];
                String rank = ranks[TotDeck[i] % 13];
                System.out.println( rank + " of " + suit);
            }
        }
    }

