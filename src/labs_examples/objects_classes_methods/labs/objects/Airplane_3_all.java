package labs_examples.objects_classes_methods.labs.objects;

public class Airplane_3_all {

    public static void main(String[] args) {

        Engines engine1 = new Engines(2000);

        Wingspan wingspan1 = new Wingspan(200);

        Brand brand1 = new Brand("Boeing");

        Model model1 = new Model("737");

        Airplane airplane1 = new Airplane(engine1, wingspan1, brand1, model1);

        System.out.println("My airplane is a " + airplane1.brand.mfg);
        System.out.println("My airplane has " + airplane1.engines.thrust + " of thrust");
        System.out.println("The model number is   " + airplane1.model.mdl);
        System.out.println("And a wingspan of  " + airplane1.wingspan.feet + " feet");


        System.out.println();
        System.out.println(airplane1.engines.thrust);

    }
}

class Engines {

    double thrust;

    public Engines(double thrust){

        this.thrust = thrust;

    }
}

class Wingspan {

    int feet;

    public Wingspan(int feet) {

        this.feet = feet;
    }

}

class Brand  {

    String mfg;

    public Brand(String mfg) {

        this.mfg = mfg;
    }
}

class Model  {

    String mdl;

    public Model(String mdl) {

        this.mdl = mdl;
    }
}

class Airplane {

    Engines engines;

    Wingspan wingspan;

    Brand brand;

    Model model;

    public Airplane(Engines engines, Wingspan wingspan, Brand brand, Model model) {

        this.engines = engines;
        this.wingspan = wingspan;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "engines=" + engines +
                ", wingspan=" + wingspan +
                ", brand=" + brand +
                ", model=" + model +
                '}';
    }
}


