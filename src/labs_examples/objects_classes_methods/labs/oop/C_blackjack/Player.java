package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Random;
import java.util.Scanner;

public class Player {


    String name;
    Hand hand;
    int cashBalance;
    int betAmount;


    public Player(int cashBalance, int betAmount) {
        this.cashBalance = cashBalance;
        this.betAmount = betAmount;
    }

    public Player() {
        hand = new Hand();
    }

    public void askName() {

        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter player name: ");
        String playerName = scan1.nextLine();

        name = playerName;
    }

    public void askMoney() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(name + " - How much money will you start with? ");
        cashBalance = scanner.nextInt();
    }

    public void askBet() {

        Scanner scan9 = new Scanner(System.in);
        System.out.print(name + " Do you want to bet?  Y/N ");
        String resp9 = scan9.nextLine();
        if (resp9.equalsIgnoreCase("Y")) {

            System.out.print(name + " - How much? Enter amount==> ");
            int resp10 = scan9.nextInt();
            betAmount = resp10 + betAmount;
        }
    }

    public void askHit(Deck deck) {
        String resp1 = "y";

        while (getHand().handVal < 22 && resp1.equalsIgnoreCase("y")) {

            askBet();

            Scanner scan4 = new Scanner(System.in);
            System.out.println(name + " Do you want a card?  Y/N");
            resp1 = scan4.nextLine();
            if (resp1.equalsIgnoreCase("Y")) {
                hit(deck);
                System.out.println(name + " has  : " + printHand());
                System.out.println(name + ": " + hand.calcHandVal());
            }
        }
        if (hand.handVal > 21) {
            hand.cards.clear();
            System.out.println(name + " busts  *******");
            System.out.println();
        }
    }

    public void hitDealer(Deck deck) {

        Random r = new Random();
        int low = 15;
        int high = 18;
        int result = r.nextInt(high-low) + low;

        while (hand.calcHandVal() < result) {
            hit(deck);
            System.out.println("Dealer has: " + printHand());
        }
        if (hand.calcHandVal() > 21) {
            hand.cards.clear();
            System.out.println("Dealer busts  *******");
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(int cashBalance) {
        this.cashBalance = cashBalance;
    }

    public int getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(int betAmount) {
        this.betAmount = betAmount;
    }

    public String printHand() {

        StringBuilder sb = new StringBuilder();

        for (Card c : hand.getCards()) {
            sb.append(c.getValue()).append(c.getSuit()).append("  ");
        }
        return sb.toString();
    }

    public void hit(Deck deck) {

        hand.getCards().add(deck.deal());
    }

    public static void greetPlayer(){

        System.out.println("Welcome to BlackJack");
    }
}

