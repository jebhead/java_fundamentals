package labs_examples.lambdas.labs;

public class QB_Const_X3 {

    public static void main(String[] args) {

        QB_InterfaceX3 qb = QB_X3 :: new;
        QB_X3 burrow = qb.listQB("Burrow", .72);
        QB_X3 mahomes = qb.listQB("Mahomes", .78);
        QB_X3 herbert = qb.listQB("Herbert", .68);

        System.out.println(burrow.toString());
        System.out.println(mahomes.toString());
        System.out.println(herbert.toString());

    }
}
