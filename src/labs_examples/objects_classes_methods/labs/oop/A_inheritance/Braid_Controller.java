package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Braid_Controller {

    public static void main(String[] args) {

        Wick a220 = new Wick("3440P", 8.3, 213, "tealight", 4.3);
        Wick r36 = new Wick("Reg36", 11.3, 188, "taper", 4.8);
        Wick cd3440 = new Wick("cd3440", 7.4, 320, "jar", 3.3);

        Lacing a4C1B1 = new Lacing("A4C1B1", 22.2, 180, "motor", false);
        Lacing pps16 = new Lacing("PPS", 23.4, 167, "auto", false);

        System.out.println(a220.toString());
        System.out.println(cd3440.toString());
        System.out.println(a4C1B1.toString());

        System.out.println("******");
        System.out.println("The strongest lacing is " + pps16.getName());

    }
}
