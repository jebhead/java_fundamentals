package labs_examples.objects_classes_methods.labs.objects;

public class Airplane {

    int age;
    String mfg;
    String model;
    int range;
    int capacity;
    int speed;
    int gallonPerHour;


    @Override
    public String toString() {
        return "Airplane{" +
                "age=" + age +
                ", mfg='" + mfg + '\'' +
                ", model='" + model + '\'' +
                ", range=" + range +
                ", capacity=" + capacity +
                ", cruiseSpeed=" + speed +
                '}';
    }

}


