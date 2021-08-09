package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Textile {

    public static void main(String[] args) {

        Yarn y1 = new Yarn("Nylon1", "N01", 300, 8.3, 180.3);
        Yarn y2 = new Yarn("Poly1", "N01", 400, 7.3, 160.3);
        Yarn y3 = new Yarn("Cotton1", "C01", 220, 6.3, 150.5);

        Spool sp1 = new Spool(y1, "black", .33, 122.2, .0032);
        Spool sp2 = new Spool(y2, "red", .23, 100.2, .0032);
        Spool sp3 = new Spool(y3, "blue", .33, 143.2, .0032);

        Braid b1 = new Braid("nyl_16", 16, 33, 122, 18.5, 4.8, sp1);
        Braid b2 = new Braid("wick_32", 32, 23, 98, 23.3, 8.8, sp3);
        Braid b3 = new Braid("fish_4", 4, 78, 675, 3.2, 0.8, sp2);
        Braid b4 = new Braid("rope_48", 48, 14, 54, 84.3, 12.8, sp1);

        B_Order o1 = new B_Order(b3,"Joe's", 354, 33.43);
        B_Order o2 = new B_Order(b2,"Yankee", 1234, 14.43);
        B_Order o3 = new B_Order(b4,"Climb Palace", 1354, 9.65);
        B_Order o4 = new B_Order(b1,"TRX", 745, 11.73);
        B_Order o5 = new B_Order(b3,"Pure", 212, 27.55);

        double rev1 = calcSale(o1.getbPricePerLb(), o1.getoLbs());
        double rev2 = calcSale(o2.getbPricePerLb(), o2.getoLbs());
        double rev3 = calcSale(o3.getbPricePerLb(), o3.getoLbs());
        double rev4 = calcSale(o4.getbPricePerLb(), o4.getoLbs());
        double rev5 = calcSale(o5.getbPricePerLb(), o5.getoLbs());

        System.out.println(sp1.yarn.getyName() + " has tensile of  " + sp1.yarn.getTensile());
    }

    public static double calcSale(double price, double lbs) {



        double saleDollars = price * lbs;
        System.out.println("sale is " + saleDollars);
        return  saleDollars;
    }


}

class Yarn {

    private String yName;
    private String yCode;
    private int yDenier;
    private double tensile;
    private double yTemp;

    public Yarn(String yName, String yCode, int yDenier, double tensile, double yTemp) {
        this.yName = yName;
        this.yCode = yCode;
        this.yDenier = yDenier;
        this.tensile = tensile;
        this.yTemp = yTemp;
    }

    public String getyName() {
        return yName;
    }

    public void setyName(String yName) {
        this.yName = yName;
    }

    public String getyCode() {
        return yCode;
    }

    public void setyCode(String yCode) {
        this.yCode = yCode;
    }

    public int getyDenier() {
        return yDenier;
    }

    public void setyDenier(int yDenier) {
        this.yDenier = yDenier;
    }

    public double getTensile() {
        return tensile;
    }

    public void setTensile(double tensile) {
        this.tensile = tensile;
    }

    public double getyTemp() {
        return yTemp;
    }

    public void setyTemp(double yTemp) {
        this.yTemp = yTemp;
    }

    @Override
    public String toString() {
        return "Yarn{" +
                "yName='" + yName + '\'' +
                ", yCode='" + yCode + '\'' +
                ", yDenier=" + yDenier +
                ", tensile=" + tensile +
                ", yTemp=" + yTemp +
                '}';
    }
}

class Spool {

    private String sColor;
    private double sWeight;
    private double sRunTime;
    private double sLaborPerSpl;
    Yarn yarn;

    public Spool(Yarn yarn, String sColor, double sWeight, double sRunTime, double sLaborPerSpl) {
        this.yarn = yarn;
        this.sColor = sColor;
        this.sWeight = sWeight;
        this.sRunTime = sRunTime;
        this.sLaborPerSpl = sLaborPerSpl;
    }

    public String getsColor() {
        return sColor;
    }

    public void setsColor(String sColor) {
        this.sColor = sColor;
    }

    public double getsWeight() {
        return sWeight;
    }

    public void setsWeight(double sWeight) {
        this.sWeight = sWeight;
    }

    public double getsRunTime() {
        return sRunTime;
    }

    public void setsRunTime(double sRunTime) {
        this.sRunTime = sRunTime;
    }

    public double getsLaborPerSpl() {
        return sLaborPerSpl;
    }

    public void setsLaborPerSpl(double sLaborPerSpl) {
        this.sLaborPerSpl = sLaborPerSpl;
    }

    public Yarn getYarn() {
        return yarn;
    }

    public void setYarn(Yarn yarn) {
        this.yarn = yarn;
    }

    @Override
    public String toString() {
        return "Spool{" +
                "sColor='" + sColor + '\'' +
                ", sWeight=" + sWeight +
                ", sRunTime=" + sRunTime +
                ", sLaborPerSpl=" + sLaborPerSpl +
                ", yarn=" + yarn +
                '}';
    }
}

class Braid {

    private String bName;
    private int bCode;
    private int ppi;
    private double bYield;
    private double bLbsPerWeekPerMach;
    private double bLaborPerMach;
    Spool spool;

    public Braid(String bName, int bCode, int ppi, double bYield, double bLbsPerWeekPerMach, double bLaborPerMach, Spool spool) {
        this.bName = bName;
        this.bCode = bCode;
        this.ppi = ppi;
        this.bYield = bYield;
        this.bLbsPerWeekPerMach = bLbsPerWeekPerMach;
        this.bLaborPerMach = bLaborPerMach;
        this.spool = spool;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public int getbCode() {
        return bCode;
    }

    public void setbCode(int bCode) {
        this.bCode = bCode;
    }

    public int getPpi() {
        return ppi;
    }

    public void setPpi(int ppi) {
        this.ppi = ppi;
    }

    public double getbYield() {
        return bYield;
    }

    public void setbYield(double bYield) {
        this.bYield = bYield;
    }

    public double getbLbsPerWeekPerMach() {
        return bLbsPerWeekPerMach;
    }

    public void setbLbsPerWeekPerMach(double bLbsPerWeekPerMach) {
        this.bLbsPerWeekPerMach = bLbsPerWeekPerMach;
    }

    public double getbLaborPerMach() {
        return bLaborPerMach;
    }

    public void setbLaborPerMach(double bLaborPerMach) {
        this.bLaborPerMach = bLaborPerMach;
    }

    public Spool getSpool() {
        return spool;
    }

    public void setSpool(Spool spool) {
        this.spool = spool;
    }

    @Override
    public String toString() {
        return "Braid{" +
                "bName='" + bName + '\'' +
                ", bCode='" + bCode + '\'' +
                ", ppi=" + ppi +
                ", bYield=" + bYield +
                ", bLbsPerWeekPerMach=" + bLbsPerWeekPerMach +
                ", bLaborPerMach=" + bLaborPerMach +
                ", spool=" + spool +
                '}';
    }
}

class B_Customer {


}


class B_Order {

    Braid braid;
    private String bCustomer;
    private double oLbs;
    private double bPricePerLb;

    public B_Order(Braid braid, String bCustomer, double oLbs, double bPricePerLb) {
        this.braid = braid;
        this.bCustomer = bCustomer;
        this.oLbs = oLbs;
        this.bPricePerLb = bPricePerLb;
    }

    public Braid getBraid() {
        return braid;
    }

    public void setBraid(Braid braid) {
        this.braid = braid;
    }

    public String getbCustomer() {
        return bCustomer;
    }

    public void setbCustomer(String bCustomer) {
        this.bCustomer = bCustomer;
    }

    public double getoLbs() {
        return oLbs;
    }

    public void setoLbs(double oLbs) {
        this.oLbs = oLbs;
    }

    public double getbPricePerLb() {
        return bPricePerLb;
    }

    public void setbPricePerLb(double bPricePerLb) {
        this.bPricePerLb = bPricePerLb;
    }

    @Override
    public String toString() {
        return "Order_brd{" +
                "braid=" + braid +
                ", bCustomer='" + bCustomer + '\'' +
                ", oLbs=" + oLbs +
                ", bPricePerLb=" + bPricePerLb +
                '}';
    }
}

