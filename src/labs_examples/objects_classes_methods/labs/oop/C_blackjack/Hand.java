package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    ArrayList<Card> cards = new ArrayList<>();
    int handVal;

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getHandVal() {
        return handVal;
    }

    public int calcHandVal() {

        int sum = 0;

        for (Card a : cards) {

            sum = a.getPointVal() + sum;
        }
        handVal = sum;
        return sum;
    }
}
