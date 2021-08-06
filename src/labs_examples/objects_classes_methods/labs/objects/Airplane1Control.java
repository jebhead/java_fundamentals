package labs_examples.objects_classes_methods.labs.objects;

public class Airplane1Control {

    public static void main(String[] args) {

        int fuelCostPerGallon = 16;

        Airplane1 a1 = new Airplane1();
        Airplane1 a2 = new Airplane1();
        Airplane1 a3 = new Airplane1();

        a1.age = 12;
        a1.mfg = "Boeing";
        a1.model = "737";
        a1.currentFuel = 323;
        a1.fuelCapacity = 354;
        a1.speed = 320;
        a1.gallonPerHour = 308;

        a2.age = 3;
        a2.mfg = "Tesla";
        a2.model = "Xa";
        a2.currentFuel = 211;
        a2.fuelCapacity = 298;
        a2.speed = 340;
        a2.gallonPerHour = 232;

        a3.age = 6;
        a3.mfg = "AirHead";
        a3.model = "SpaceMan14";
        a3.currentFuel = 190;
        a3.fuelCapacity = 293;
        a3.speed = 380;
        a3.gallonPerHour = 177;

        System.out.println("Ranges comp: " + a1.currentFuel + " " + a2.currentFuel + " " + a3.currentFuel);

        double cost_a1 = costPerPerson(a1.fuelCapacity, a1.gallonPerHour, fuelCostPerGallon);
        double cost_a2 = costPerPerson(a2.fuelCapacity, a2.gallonPerHour, fuelCostPerGallon);
        double cost_a3 = costPerPerson(a3.fuelCapacity, a3.gallonPerHour, fuelCostPerGallon);

        System.out.println("Cost per hour: " + cost_a1 + " " + cost_a2 + " " + cost_a3);

        double cumMiles_a1 = passengerDistance(a1.fuelCapacity, a1.speed);
        double cumMiles_a2 = passengerDistance(a2.fuelCapacity, a2.speed);
        double cumMiles_a3 = passengerDistance(a3.fuelCapacity, a3.speed);

        System.out.println("Cumulative passenger miles per hour : " + cumMiles_a1 + " " + cumMiles_a2 + " " + cumMiles_a3);

        double tot_a1 = totalIndex(a1.currentFuel, a1.fuelCapacity, a1.speed, a1.gallonPerHour);
        double tot_a2 = totalIndex(a2.currentFuel, a2.fuelCapacity, a2.speed, a2.gallonPerHour);
        double tot_a3 = totalIndex(a3.currentFuel, a3.fuelCapacity, a3.speed, a3.gallonPerHour);

        System.out.println("Total index of performance : " + tot_a1 + " " + tot_a2 + " " + tot_a3);

        System.out.println("Airplane A1 : "  + a1.toString());
        System.out.println("Airplane A2 : "  + a2.toString());
        System.out.println("Airplane A3 : "  + a3.toString());
    }

    public static double costPerPerson(double capacity, int gallonPerHour, int fuelCostPerGallon) {

        double cost = fuelCostPerGallon * gallonPerHour / capacity;
        return cost;
    }

    public static double passengerDistance(double capacity, int speed) {

        double cumMiles = capacity * speed;
        return cumMiles;

    }

    public static double totalIndex(double range, double capacity, int speed, int gallonPerHour) {

        double totindex = (range * speed) / (capacity * gallonPerHour);
        return totindex;

    }
}
