package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class A_Clothes_Controller {

    public static void main(String[] args) {

        Hat h1 = new Hat("wool", 35, 7.5, "none");
        Hat h2 = new Hat("cotton", 12, 7.125, "full brim");

        Shirt s1 = new Shirt("cotton", 45, 16.5, 35);
        Shirt s2 = new Shirt("wool", 55, 16.5, 34.5);

        Pants p1 = new Pants("wool", 55, 35, 34);
        Pants p2 = new Pants("denim", 45, 36, 34);

        Shoes shoe1 = new Shoes("leather", 65, 7, 11.5);
        Shoes shoe2 = new Shoes("canvass", 45, 7, 11.5);

        Watch w1 = new Watch("NA", 99, "stainless", "automatic", 34.5);
        Necklace n1 = new Necklace("NA", 123, "gold", "diamond");

        Outfit look1 = new Outfit(h1, p2, s2, shoe1, w1);
        Outfit look2 = new Outfit(h2, p2, s1, shoe2, n1);

        System.out.println(look1.hat.getHeadSize());
        System.out.println(look1.pants.getWaist());

        double lookCost1 = howMuch(look1.hat, look1.pants, look1.shirt, look1.shoes, look1.jewelry);
        double lookCost2 = howMuch(look2.hat, look2.pants, look2.shirt, look2.shoes, look2.jewelry);

        System.out.println("Look one costs " + lookCost1);
        System.out.println("Look two costs " + lookCost2);
    }

    public static double howMuch(Hat hat, Pants pants, Shirt shirt, Shoes shoes, Jewelry jewelry) {

        double addUp = hat.getPrice() + pants.getPrice() + shirt.getPrice() + shoes.getPrice() + jewelry.getPrice();
        return addUp;
    }
}



