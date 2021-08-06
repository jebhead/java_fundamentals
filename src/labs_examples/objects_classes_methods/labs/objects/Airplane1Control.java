package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneControl {

    public static void main(String[] args) {

        int fuelCostPerGallon = 16;

        Airplane a1 = new Airplane();
        Airplane a2 = new Airplane();
        Airplane a3 = new Airplane();

        a1.age = 12;
        a1.mfg = "Boeing";
        a1.model = "737";
        a1.range = 3230;
        a1.capacity = 354;
        a1.speed = 320;
        a1.gallonPerHour = 308;

        a2.age = 3;
        a2.mfg = "Tesla";
        a2.model = "Xa";
        a2.range = 3325;
        a2.capacity = 298;
        a2.speed = 340;
        a2.gallonPerHour = 232;

        a3.age = 6;
        a3.mfg = "AirHead";
        a3.model = "SpaceMan14";
        a3.range = 3267;
        a3.capacity = 293;
        a3.speed = 380;
        a3.gallonPerHour = 177;

        System.out.println("Ranges comp: " + a1.range + " " + a2.range + " " + a3.range);

        int cost_a1 = costPerPerson(a1.capacity, a1.gallonPerHour, fuelCostPerGallon);
        int cost_a2 = costPerPerson(a2.capacity, a2.gallonPerHour, fuelCostPerGallon);
        int cost_a3 = costPerPerson(a3.capacity, a3.gallonPerHour, fuelCostPerGallon);

        System.out.println("Cost per hour: " + cost_a1 + " " + cost_a2 + " " + cost_a3);

        int cumMiles_a1 = passengerDistance(a1.capacity, a1.speed);
        int cumMiles_a2 = passengerDistance(a2.capacity, a2.speed);
        int cumMiles_a3 = passengerDistance(a3.capacity, a3.speed);

        System.out.println("Cumulative passenger miles per hour : " + cumMiles_a1 + " " + cumMiles_a2 + " " + cumMiles_a3);

        int tot_a1 = totalIndex(a1.range, a1.capacity, a1.speed, a1.gallonPerHour);
        int tot_a2 = totalIndex(a2.range, a2.capacity, a2.speed, a2.gallonPerHour);
        int tot_a3 = totalIndex(a3.range, a3.capacity, a3.speed, a3.gallonPerHour);

        System.out.println("Total index of performance : " + tot_a1 + " " + tot_a2 + " " + tot_a3);

    }

    public static int costPerPerson(int capacity, int gallonPerHour, int fuelCostPerGallon) {

        int cost = fuelCostPerGallon * gallonPerHour / capacity;
        return cost;
    }

    public static int passengerDistance(int capacity, int speed) {

        int cumMiles = capacity * speed;
        return cumMiles;

    }

    public static int totalIndex(int range, int capacity, int speed, int gallonPerHour) {

        int totindex = (range * speed) / (capacity * gallonPerHour);
        return totindex;

    }
}
