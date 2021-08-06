package labs_examples.objects_classes_methods.labs.objects;

public class Airplane_2_Control {

    public static void main(String[] args) {

        Airplane_2 jet1 = new Airplane_2(133.2, 66.3, 2200, 432, 230);
        Airplane_2 jet2 = new Airplane_2(230.2, 66.4, 2600, 402, 122);
        Airplane_2 jet3 = new Airplane_2(190.3, 45.3, 2400, 390, 160);
        Airplane_2 jet4 = new Airplane_2(145.7, 34.8, 2300, 444, 180);

        double mpg1 = milesPergallon(jet1.fltRange, jet1.fuelCapacity);
        double mpg2 = milesPergallon(jet2.fltRange, jet2.fuelCapacity);
        double mpg3 = milesPergallon(jet3.fltRange, jet3.fuelCapacity);
        double mpg4 = milesPergallon(jet4.fltRange, jet4.fuelCapacity);

        System.out.println("Jet1 mpg is " + mpg1);
        System.out.println("Jet1 mpg is " + mpg2);
        System.out.println("Jet1 mpg is " + mpg3);
        System.out.println("Jet1 mpg is " + mpg4);
        System.out.println();

        double fppm1 = fuelPerPassMile(jet1.fltRange, jet1.fuelCapacity, jet1.passengers);
        double fppm2 = fuelPerPassMile(jet2.fltRange, jet2.fuelCapacity, jet2.passengers);
        double fppm3 = fuelPerPassMile(jet3.fltRange, jet3.fuelCapacity, jet3.passengers);
        double fppm4 = fuelPerPassMile(jet4.fltRange, jet4.fuelCapacity, jet4.passengers);

        System.out.println("Fuel required per passenger mile for jet1 " + fppm1);
        System.out.println("Fuel required per passenger mile for jet2 " + fppm2);
        System.out.println("Fuel required per passenger mile for jet3 " + fppm3);
        System.out.println("Fuel required per passenger mile for jet4 " + fppm4);
    }

    public static double milesPergallon(int fltRange, double fuelCapacity) {

        double mpg = fltRange / fuelCapacity;
        return mpg;
    }

    public static double fuelPerPassMile(int fltRange, double fuelCapacity, int passengers) {

        double fppm = fltRange * passengers / fuelCapacity;
        return fppm;


    }


}
