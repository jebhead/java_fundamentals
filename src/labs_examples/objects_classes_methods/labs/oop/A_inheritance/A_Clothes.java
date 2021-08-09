package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class A_Clothes {

    private String clothType;
    private double price;

    public A_Clothes(String clothType, double price) {
        this.clothType = clothType;
        this.price = price;
    }

    public String getClothType() {
        return clothType;
    }

    public void setClothType(String clothType) {
        this.clothType = clothType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Hat extends A_Clothes {

    private double headSize;
    private String visor;

    public Hat(String clothType, double price, double headSize, String visor) {
        super(clothType, price);
        this.headSize = headSize;
        this.visor = visor;
    }

    public double getHeadSize() {
        return headSize;
    }

    public void setHeadSize(double headSize) {
        this.headSize = headSize;
    }

    public String getVisor() {
        return visor;
    }

    public void setVisor(String visor) {
        this.visor = visor;
    }
}

class Pants extends A_Clothes {

    private double waist;
    private double inseam;

    public Pants(String clothType, double price, double waist, double inseam) {
        super(clothType, price);
        this.waist = waist;
        this.inseam = inseam;
    }

    public double getWaist() {
        return waist;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }

    public double getInseam() {
        return inseam;
    }

    public void setInseam(double inseam) {
        this.inseam = inseam;
    }
}

class Shirt extends A_Clothes {

    private double neck;
    private double sleeve;

    public Shirt(String clothType, double price, double neck, double sleeve) {
        super(clothType, price);
        this.neck = neck;
        this.sleeve = sleeve;
    }

    public double getNeck() {
        return neck;
    }

    public void setNeck(double neck) {
        this.neck = neck;
    }

    public double getSleeve() {
        return sleeve;
    }

    public void setSleeve(double sleeve) {
        this.sleeve = sleeve;
    }
}

class Shoes extends A_Clothes {

    private double width;
    private double footSize;

    public Shoes(String clothType, double price, double width, double footSize) {
        super(clothType, price);
        this.width = width;
        this.footSize = footSize;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getFootSize() {
        return footSize;
    }

    public void setFootSize(double footSize) {
        this.footSize = footSize;
    }
}

class Jewelry extends A_Clothes {

    private String material;

    public Jewelry(String clothType, double price, String material) {
        super(clothType, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

class Watch extends Jewelry {

    private String mechanism;
    private double diameter;

    public Watch(String clothType, double price, String material, String mechanism, double diameter) {
        super(clothType, price, material);
        this.mechanism = mechanism;
        this.diameter = diameter;
    }

    public String getMechanism() {
        return mechanism;
    }

    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}

class Necklace extends Jewelry {

    private String gem;

    public Necklace(String clothType, double price, String material, String gem) {
        super(clothType, price, material);
        this.gem = gem;
    }

    public String getGem() {
        return gem;
    }

    public void setGem(String gem) {
        this.gem = gem;
    }
}

class Outfit {

    Hat hat;
    Pants pants;
    Shirt shirt;
    Shoes shoes;
    Jewelry jewelry;

    public Outfit(Hat hat, Pants pants, Shirt shirt, Shoes shoes, Jewelry jewelry) {
        this.hat = hat;
        this.pants = pants;
        this.shirt = shirt;
        this.shoes = shoes;
        this.jewelry = jewelry;
    }

    public Hat getHat() {
        return hat;
    }

    public void setHat(Hat hat) {
        this.hat = hat;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Shirt getShirt() {
        return shirt;
    }

    public void setShirt(Shirt shirt) {
        this.shirt = shirt;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public Jewelry getJewelry() {
        return jewelry;
    }

    public void setJewelry(Jewelry jewelry) {
        this.jewelry = jewelry;
    }

    @Override
    public String toString() {
        return "Outfit{" +
                "hat=" + hat +
                ", pants=" + pants +
                ", shirt=" + shirt +
                ", shoes=" + shoes +
                ", jewelry=" + jewelry +
                '}';
    }
}
