package labs_examples.lambdas.labs;

public class InstMethRef {

    public void instMethod() {

        System.out.println("This is from an instance method");
    }

    public static void main(String[] args) {

        InstMethRef obj = new InstMethRef();
        Inst_Interface_X3 result = obj :: instMethod;
        result.outputR();
    }

}
