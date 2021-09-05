package labs_examples.objects_classes_methods.Project_XX;

import java.util.ArrayList;

public class People {

    private int identity;
    int bmi;
    int age;
    Diseases disease;
    Location location;


    public People(int identity, int bmi, int age, Diseases disease, Location location) {
        this.identity = identity;
        this.bmi = bmi;
        this.age = age;
        this.disease = disease;
        this.location = location;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public int getBmi() {
        return bmi;
    }

    public void setBmi(int bmi) {
        this.bmi = bmi;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Diseases getDisease() {
        return disease;
    }

    public void setDisease(Diseases disease) {
        this.disease = disease;
    }
}
