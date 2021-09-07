package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {

    private char suit;
    private String value;
    private int pointVal;

    public Card(char suit, String value) {
        this.suit = suit;
        this.value = value;

        setPointVal(value);

    }

    private void setPointVal(String value) {

        switch (value) {
            case "A" : pointVal = 1;
                break;
            case "2" : pointVal = 2;
                break;
            case "3" : pointVal = 3;
                break;
            case "4" : pointVal = 4;
                break;
            case "5" : pointVal = 5;
                break;
            case "6" : pointVal = 6;
                break;
            case "7" : pointVal = 7;
                break;
            case "8" : pointVal = 8;
                break;
            case "9" : pointVal = 9;
                break;
            case "10" : pointVal = 10;
                break;
            case "J" : pointVal = 10;
                break;
            case "Q" : pointVal = 10;
                break;
            case "K" : pointVal = 10;
                break;
        }
    }

    public char getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    public int getPointVal() {
        return pointVal;
    }
}
