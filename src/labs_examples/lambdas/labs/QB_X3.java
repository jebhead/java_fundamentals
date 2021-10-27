package labs_examples.lambdas.labs;

public class QB_X3 {

    String lastname;
    double compPerc;

    public QB_X3(String lastname, double compPerc) {
        this.lastname = lastname;
        this.compPerc = compPerc;
    }

    @Override
    public String toString() {
        return "QB_X3{" +
                "lastname='" + lastname + '\'' +
                ", compPerc=" + compPerc +
                '}';
    }
}
