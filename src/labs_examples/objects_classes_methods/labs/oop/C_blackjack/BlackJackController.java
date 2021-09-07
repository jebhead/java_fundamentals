package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJackController {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Black Jack - dealer wins ties ... ");
        Player.greetPlayer();
        System.out.print("Enter up to two players ...");
        System.out.println();

        Player player1 = new Player();
        Player player2 = new Player();
        Player dealer = new Player();

        Deck deck = new Deck();

        int numplaying = checkNumPlaying();

        if (numplaying == 1) {
            player1.askName();
            player1.askMoney();
            dealer.setName("Dealer");

            playGame(deck, dealer, player1);

        } else if (numplaying == 2) {
            player1.askName();
            player2.askName();
            dealer.setName("Dealer");
            player1.askMoney();
            player2.askMoney();

            playGame(deck, dealer, player1, player2);

        } else {
            System.out.println("GoodBye");
        }
    }

    //============= Begin Methods =====================

    private static void playGame(Deck deck, Player... players) {

        Player player1;
        Player player2;
        Player dealer;

        boolean twoPlayers = false;

        if (players.length > 2) {
            player1 = players[1];
            player2 = players[2];
            dealer = players[0];
            twoPlayers = true;
        } else {
            player1 = players[1];
            dealer = players[0];
            player2 = null;
        }

        for (Player player : players) {
        System.out.println(player.name + "*");
        }

        if (twoPlayers) {
            System.out.println("Ok " + player1.name + " & " + player2.name + " Let's play!  ");
            System.out.println();
        } else {
            System.out.println("Ok " + player1.name + " Let's play!  ");
            System.out.println();
        }

        for (int x = 1; x < players.length; x++) {

            players[x].askBet();
            players[x].hit(deck);
            players[x].hit(deck);
        }

        for (int x = 1; x < players.length; x++) {
            System.out.println(players[x].name + " has  : " + players[x].printHand());
        }

        for (int x = 1; x < players.length; x++) {
            players[x].askHit(deck);
        }

        for (int x = 1; x < players.length; x++) {
            System.out.println(players[x].name + " has  : " + players[x].printHand());
        }
        System.out.println();

        players[0].hitDealer(deck);
        System.out.println();

        for (int x = 0; x < players.length; x++) {
            System.out.println(players[x].name + " has " + players[x].hand.calcHandVal());
        }

        if (twoPlayers) {
            if (player1.hand.handVal > dealer.hand.handVal && player1.hand.handVal > player2.hand.handVal) {
                System.out.println(player1.name + " Wins!!!");
                player1.cashBalance = player1.cashBalance + player1.betAmount;
                System.out.println(player1.name + " new balance is " + player1.cashBalance);
                player2.cashBalance = player2.cashBalance - player2.betAmount;
                System.out.println(player2.name + " new balance is " + player2.cashBalance);
            } else if
            (player2.hand.handVal > dealer.hand.handVal && player2.hand.handVal > player1.hand.handVal) {
                System.out.println(player2.name + " Wins!!!");
                player2.cashBalance = player2.cashBalance + player2.betAmount;
                System.out.println(player2.name + " new balance is " + player2.cashBalance);
                player1.cashBalance = player1.cashBalance - player1.betAmount;
                System.out.println(player1.name + " new balance is " + player1.cashBalance);
            } else if (dealer.hand.handVal >= player1.hand.handVal && dealer.hand.handVal >= player2.hand.handVal){
                System.out.println("Dealer wins");
                player2.cashBalance = player2.cashBalance - player2.betAmount;
                System.out.println(player2.name + " the new balance is " + player2.cashBalance);
                player1.cashBalance = player1.cashBalance - player1.betAmount;
                System.out.println(player1.name + " the new balance is " + player1.cashBalance);
            }

            playNewGame(deck, players);

        } else {

            if (player1.hand.handVal > dealer.hand.handVal) {
                System.out.println(player1.name + " Wins!!!");
                player1.cashBalance = player1.cashBalance + player1.betAmount;
                System.out.println(player1.name + " new balance is " + player1.cashBalance);

            } else {
                System.out.println("Dealer wins");
                player1.cashBalance = player1.cashBalance - player1.betAmount;
                System.out.println(player1.name + " new balance is " + player1.cashBalance);
            }

            playNewGame(deck, players);
        }
    }

    private static int checkNumPlaying() {

        Scanner scan3 = new Scanner(System.in);
        System.out.println("How many players .. 1 or 2 ??? ");
        int numPlay = scan3.nextInt();
        System.out.println("OK " + numPlay + " players.");
        System.out.println();

        return numPlay;
    }

    private static void playNewGame(Deck deck, Player... players) {

        Player player1;
        Player player2;
        Player dealer;

        Scanner scan31 = new Scanner(System.in);
        System.out.println(" Do you want to play again?  Y/N");
        String resp31 = scan31.nextLine();


        if (resp31.equalsIgnoreCase("Y")) {
            for (int x = 1; x < players.length; x++) {

                players[x].betAmount = 0;
                players[x].hand.cards.clear();
                players[0].hand.cards.clear();
                deck.usedCards.clear();
                System.out.println(players[x].name);
            }

                if (players.length > 2) {

                    playGame(deck, players);
                }
                else {

                    playGame(deck, players);

                }

        } else {
            System.out.println("goodbye");
        }
    }
}






