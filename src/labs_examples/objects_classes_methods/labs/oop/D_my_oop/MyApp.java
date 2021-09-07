package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {


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
//        for (int s = 0; s < 52; s++) {
//            System.out.println(cards[s]);
//        }

        //===================================


        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> dealer = new ArrayList<>();

        for (int b = 0; b < 2; b++) {

            int temp = getValue();
            player1.add(cards[temp]);

            temp = getValue();
            player2.add(cards[temp]);

            temp = getValue();
            dealer.add(cards[temp]);
        }

        System.out.println("Player 1 cards: " + player1);
        System.out.println("Player 2 cards: " + player2);
        System.out.println("Dealer's cards: " + dealer);
        System.out.println();

        // Ask Player 1 for more cards ****

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Player 1 ... Want another card? Y/N ");

        String p1_hit = scan1.next();

        if (p1_hit.equalsIgnoreCase("y")) {
            int temp = getValue();
            player1.add(cards[temp]);
        }
        System.out.println();
        System.out.println("Player 1 cards: " + player1);
        System.out.println();

        if (p1_hit.equalsIgnoreCase("y")) {
            Scanner scan12 = new Scanner(System.in);
            System.out.println("Player 1 ... Want another card? Y/N ");

            String p12_hit = scan12.next();

            if (p12_hit.equalsIgnoreCase("y")) {
                int temp = getValue();
                player1.add(cards[temp]);
            }
            System.out.println("Player 1 cards: " + player1);
            System.out.println();
        }

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Player 2 - recall your cards... " + player2);
        System.out.println("Player 2 ... Want another card? Y/N ");


        String p2_hit = scan2.next();

        if (p2_hit.equalsIgnoreCase("y")) {
            int temp = getValue();
            player2.add(cards[temp]);
        }

        System.out.println();
        System.out.println("Player 2 cards: " + player2);
        System.out.println();

        if (p2_hit.equalsIgnoreCase("y")) {
            Scanner scan22 = new Scanner(System.in);
            System.out.println("Player 2 ... Want another card? Y/N ");

            String p22_hit = scan22.next();

            if (p22_hit.equalsIgnoreCase("y")) {
                int temp = getValue();
                player2.add(cards[temp]);
            }
            System.out.println("Player 2 cards: " + player2);
            System.out.println();
        }

        if (dealer.get(0) + dealer.get(1) < 17) {
            int temp = getValue();
            dealer.add(cards[temp]);
            if (dealer.get(0) + dealer.get(1) + dealer.get(2) < 17) {
                int temp1 = getValue();
                dealer.add(cards[temp1]);
            }
        }

        System.out.println("Player 1 final:  " + player1);
        System.out.println("Player 2 final:  " + player2);
        System.out.println("Dealer's final:  " + dealer);
        System.out.println();

        int p1Tot = getTotal(player1);
        int p2Tot = getTotal(player2);
        int dealerTot = getTotal(dealer);

        System.out.println("player 1 total = " + p1Tot);
        System.out.println("player 2 total = " + p2Tot);
        System.out.println("dealer's total = " + dealerTot);
        System.out.println();

        if (p1Tot > 21) {
            p1Tot = 0;
        }
        if (p2Tot > 21) {
            p2Tot = 0;
        }
        if (dealerTot > 21) {
            dealerTot = 0;
        }


        if (p1Tot < 22 && p1Tot >= p2Tot && p1Tot >= dealerTot) {
            System.out.println("Player 1 wins!");
        }

        if (p2Tot < 22 && p2Tot >= p1Tot && p2Tot >= dealerTot) {
            System.out.println("Player 2 wins!");
        }

        if (dealerTot < 22 && dealerTot > p1Tot && dealerTot > p2Tot) {
            System.out.println("Dealer wins!");
        }
    }


    public static int getTotal(ArrayList player) {

        int sum = 0;

        for (int w = 0; w < player.size(); w++) {

            sum = (Integer) player.get(w) + sum;
        }
        return sum;
    }


    public static int getValue() {

        Random rand = new Random();
        ArrayList<Integer> used = new ArrayList();

        int upperbound = 52;
        int ranInt = rand.nextInt(upperbound);

        used.add(ranInt);
        if (used.size() > 1) {

            for (int n = 0; n < used.size(); n++) {
                if (used.get(n) == ranInt) {
                    ranInt = rand.nextInt(upperbound);  //checked just once???
                    for (int i = 0; i < used.size(); i++) {
                        if (used.get(n) == ranInt) {
                            ranInt = rand.nextInt(upperbound);  //checked just once???
                            for (int t = 0; t < used.size(); t++) {
                                if (used.get(n) == ranInt) {
                                    ranInt = rand.nextInt(upperbound);  //checked just once???
                                    for (int y = 0; y < used.size(); y++) {
                                        if (used.get(n) == ranInt) {
                                            ranInt = rand.nextInt(upperbound);  //checked just once???
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        //System.out.println("ranInt is " + ranInt);

        return ranInt;
    }

    //public static int makeCard() {}
}
