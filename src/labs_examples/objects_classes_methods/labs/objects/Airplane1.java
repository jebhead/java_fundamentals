package labs_examples.objects_classes_methods.labs.objects;

public class Airplane1 {

    int age;
    String mfg;
    String model;
    double currentFuel;
    double fuelCapacity;
    int speed;
    int gallonPerHour;


    @Override
    public String toString() {
        return "Airplane{" +
                "age=" + age +
                ", mfg='" + mfg + '\'' +
                ", model='" + model + '\'' +
                ", range=" + currentFuel +
                ", capacity=" + fuelCapacity +
                ", cruiseSpeed=" + speed +
                '}';
    }

}


