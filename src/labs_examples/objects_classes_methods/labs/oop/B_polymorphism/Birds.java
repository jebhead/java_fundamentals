package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Birds {

    private double weight;
    private double flightSpeed;
    private double walkSpeed;

    public Birds(double weight, double flightSpeed, double walkSpeed) {
        this.weight = weight;
        this.flightSpeed = flightSpeed;
        this.walkSpeed = walkSpeed;
    }
}

class Flying extends Birds {

    public Flying(double weight, double flightSpeed, double walkSpeed) {
        super(weight, flightSpeed, walkSpeed);

        double range = maxRange(flightSpeed, 12);
        System.out.println("Max flight range is: " + range);
    }

    public double maxRange(double fspd, int x) {

        double fRange = fspd * x;
        return fRange;
    }
}

class Flightless extends Birds {

    public Flightless(double weight, double flightSpeed, double walkSpeed) {
        super(weight, flightSpeed, walkSpeed);

        double range = maxRange(walkSpeed, 8);
        System.out.println("Max walk range is: " + range);
    }

    public double maxRange(double fspd, int x) {

        double wRange = fspd * x;
        return wRange;
    }
}

class Range_Control {

    public static void main(String[] args) {

        Birds gull = new Flying(22.1, 32.4, 3.2);
        Birds robin = new Flying(17.1, 28.4, 3.2);

        Birds emu = new Flightless(164.4, 0, 6.5);
        Birds ostrich = new Flightless(264.4, 0, 9.5);

    }
}
