package labs_examples.objects_classes_methods.labs.objects;

public class Airplane_2 {

    double fuelCapacity;
    double currentFuel;
    int fltRange;
    int topSpeed;
    int passengers;


    public Airplane_2(double fuelCapacity, double currentFuel, int fltRange, int topSpeed, int passengers)  {
        this.fuelCapacity = fuelCapacity;
        this.currentFuel = currentFuel;
        this.fltRange = fltRange;
        this.topSpeed = topSpeed;
        this.passengers = passengers;
    }
    public Airplane_2(int passengers) {
        this.passengers = passengers;
    }
    public Airplane_2() {}
}
