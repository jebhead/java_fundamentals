package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards = new ArrayList<>();
    char[] suits = new char[]{'♠', '♦', '♥', '♣'};
    String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    public Deck() {

        populateDeck();
    }

    private void populateDeck() {

        int count = 0;

        for (String value : values) {
            for (char suit : suits) {
                Card c = new Card(suit,value);
                cards[count] = c;
                count++;
            }
        }
    }

    public Card deal() {

        Random rand = new Random();
        int num = rand.nextInt(52);
        while(usedCards.contains(num)) {
            num = rand.nextInt(52);
        }
        usedCards.add(num);
        return cards[num];

    }

}
