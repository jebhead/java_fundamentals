package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import java.util.Random;

public class NumberGame {

    public static void main(String[] args) {

        Player p1 = new Player(4, 7, 5);
        Player p2 = new Player(6, 8, 2);

        int score_1_1 = p1.getSkill_1() * genRand();
        int score_1_2 = p1.getSkill_2() * genRand();
        int score_1_3 = p1.getSkill_3() * genRand();

        int p1_gameScore = score_1_1 + score_1_2 + score_1_3;

        int score_2_1 = p2.getSkill_1() * genRand();
        int score_2_2 = p2.getSkill_2() * genRand();
        int score_2_3 = p2.getSkill_3() * genRand();

        int p2_gameScore = score_2_1 + score_2_2 + score_2_3;

        System.out.println("player 1 scores: " + p1_gameScore);
        System.out.println("player 2 scores: " + p2_gameScore);

        if(p2_gameScore < p1_gameScore) {
            System.out.println("Player 1 wins");
        } else System.out.println("Player 2 wins");


        int p1_otherScore = genRand(p1.getSkill_1(), p1.getSkill_2(), p1.getSkill_3());
        int p2_otherScore = genRand(p2.getSkill_1(), p2.getSkill_2(), p2.getSkill_3());

        System.out.println("Player 1 other score " + p1_otherScore);
        System.out.println("Player 2 other score " + p2_otherScore);

        if(p2_otherScore < p1_otherScore) {
            System.out.println("Player 1 wins");
        } else System.out.println("Player 2 wins");


    }

    public static int genRand() {

        Random rand = new Random();

        int upperbound = 10;

        int ranInt = rand.nextInt(upperbound);

        System.out.println("ranInt is " + ranInt);

        return ranInt;

    }

    public static int genRand(int s1, int s2, int s3) {

        Random rand = new Random();

        int upperbound = 10;

        int ranInt = rand.nextInt(upperbound);

        int score = ranInt * (s1 + s2 + s3);


        return score;

    }
}

class Player  {

    private int skill_1;
    private int skill_2;
    private int skill_3;

    public Player(int skill_1, int skill_2, int skill_3) {
        this.skill_1 = skill_1;
        this.skill_2 = skill_2;
        this.skill_3 = skill_3;
    }

    public int getSkill_1() {
        return skill_1;
    }

    public void setSkill_1(int skill_1) {
        this.skill_1 = skill_1;
    }

    public int getSkill_2() {
        return skill_2;
    }

    public void setSkill_2(int skill_2) {
        this.skill_2 = skill_2;
    }

    public int getSkill_3() {
        return skill_3;
    }

    public void setSkill_3(int skill_3) {
        this.skill_3 = skill_3;
    }
}
