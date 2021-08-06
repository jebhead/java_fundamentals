package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class BraidTypes {

    private String name;
    private double tensile;
    private double yield;

    public BraidTypes(String name, double tensile, double yield) {
        this.name = name;
        this.tensile = tensile;
        this.yield = yield;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTensile() {
        return tensile;
    }

    public void setTensile(double tensile) {
        this.tensile = tensile;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        this.yield = yield;
    }

    @Override
    public String toString() {
        return "BraidTypes{" +
                "name='" + name + '\'' +
                ", tensile=" + tensile +
                ", yield=" + yield +
                '}';
    }
}

class Wick extends BraidTypes {

    private String forCandleType;
    private double drawRate;

    public Wick(String name, double tensile, double yield, String forCandleType, double drawRate) {
        super(name, tensile, yield);
        this.forCandleType = forCandleType;
        this.drawRate = drawRate;

    }

    @Override
    public String toString() {
        return "Wick{" +
                "forCandleType='" + forCandleType + '\'' +
                ", drawRate=" + drawRate +
                '}';
    }
}

class Lacing extends BraidTypes {

    private String forAppType;
    private Boolean waxed;

    public Lacing(String name, double tensile, double yield, String forAppType, Boolean waxed) {
        super(name, tensile, yield);
        this.forAppType = forAppType;
        this.waxed = waxed;

    }

    @Override
    public String toString() {
        return "Lacing{" +
                "forAppType='" + forAppType + '\'' +
                ", waxed=" + waxed +
                '}';
    }
}


