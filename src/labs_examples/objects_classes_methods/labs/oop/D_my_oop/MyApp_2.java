package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyApp_2 {

    static ArrayList<Integer> used = new ArrayList();

    public static void main(String[] args) {

        //===============================================
        // Build deck with 52 values mirroring card values

        int[] cards = makeDeck();

//        for (int s = 0; s < 52; s++) {
//            System.out.println(cards[s]);
//        }
        //===============================================
        // Define players and the dealer

        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> dealer = new ArrayList<>();

        //===============================================
        //  Get first two cards for each player

        player1 = firstTwoCards(player1, cards);
        player2 = firstTwoCards(player2, cards);
        dealer = firstTwoCards(dealer, cards);

        System.out.println("Player 1 first hand: " + player1);
        System.out.println("Player 2 first hand: " + player2);
        System.out.println("Dealer first hand: " + dealer);
        System.out.println();

        //==============================================
        //  Get additional cards if "Y"


        System.out.println("Player 1 ***");
        player1 = hitCards(player1, cards);

        System.out.println("Player 1 Final hand ... " + player1);
        System.out.println("------");
        System.out.println();

        System.out.println("Player 2 - recall your hand ... " + player2);

        player2 = hitCards(player2, cards);

        System.out.println("Player 2, your final hand is  " + player2);
        System.out.println("*******");
        System.out.println();

        if (dealer.get(0) + dealer.get(1) < 17) {
            int temp = getValue();
            dealer.add(cards[temp]);
            if (dealer.get(0) + dealer.get(1) + dealer.get(2) < 17) {
                int temp1 = getValue();
                dealer.add(cards[temp1]);
            }
        }

        System.out.println("Player 1 FINAL: " + player1);
        System.out.println("Player 2 FINAL: " + player2);
        System.out.println("Dealer's FINAL: " + dealer);
        System.out.println();

        int p1Tot = getTotal(player1);
        int p2Tot = getTotal(player2);
        int dealerTot = getTotal(dealer);

        System.out.println("player 1 total = " + p1Tot);
        System.out.println("player 2 total = " + p2Tot);
        System.out.println("dealer's total = " + dealerTot);
        System.out.println();

        if (p1Tot > 21) { p1Tot = 0; }
        if (p2Tot > 21) { p2Tot = 0; }
        if (dealerTot > 21) { dealerTot = 0; }


        if(p1Tot < 22 && p1Tot > p2Tot && p1Tot > dealerTot) {
            System.out.println("Player 1 wins!");
        } else if (p2Tot < 22 && p2Tot > p1Tot && p2Tot > dealerTot) {
            System.out.println("Player 2 wins!");
        } else if (dealerTot < 22 && dealerTot > p1Tot && dealerTot > p2Tot) {
            System.out.println("Dealer wins!");
        }

    }

    //=========================
    // Methods


    public static int getTotal(ArrayList player) {

        int sum = 0;

        for (int w = 0; w < player.size(); w++) {

            sum = (Integer) player.get(w) + sum;
        }
        return sum;
    }


    public static ArrayList hitCards(ArrayList player, int[] cards) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("        ... Want another card? Y/N ");

        String p1_hit = scan1.next();

        if (p1_hit.equalsIgnoreCase("y")) {

            int temp = getValue();
            player.add(cards[temp]);
            System.out.println(player);
        }
        if (p1_hit.equalsIgnoreCase("y")) {
            Scanner scan2 = new Scanner(System.in);
            System.out.println("         ... Want another card? Y/N ");

            String p2_hit = scan2.next();

            if (p2_hit.equalsIgnoreCase("y")) {

                hitCards(player, cards);
            }
        }
        return player;
    }


    public static ArrayList firstTwoCards(ArrayList player, int[] cards) {

        for (int b = 0; b < 2; b++) {

            int temp = getValue();
            player.add(cards[temp]);

        }
        return player;
    }


    public static int[] makeDeck() {


        int[] cards = new int[52];

        int c = 0;

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 4; j++) {

                cards[c] = i + 1;
                c = c + 1;
            }
        }

        for (int x = 40; x < 52; x++) {

            cards[x] = 10;

        }
        return cards;
    }

    public static int getValue() {

        Random rand = new Random();


        int upperbound = 52;
        int ranInt = rand.nextInt(upperbound);

        while(used.contains(ranInt)) {

            ranInt = rand.nextInt(upperbound);
        }

        used.add(ranInt);

        return ranInt;
    }
}
