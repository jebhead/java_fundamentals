package labs_examples.objects_classes_methods.labs.methods;

public class xPass_Ref {

    int r1;
    int r2;
    String name;

    public xPass_Ref(int r1, int r2, String name) {
        this.r1 = r1;
        this.r2 = r2;
        this.name = name;

    }

    public static void main(String[] args) {

        xPass_Ref object = new xPass_Ref(23, 29, "Jeb");
        System.out.println("These are object attributes " + object.r1 + " " + object.r2 + " " + object.name);
        refEx(object);
        System.out.println("These are object attributes " + object.r1 + " " + object.r2 + " " + object.name);
        int i = 5;
        valEx(i);
        System.out.println(i);
    }

    public static void refEx(xPass_Ref obj) {

        obj.r1 = 11;
    }
    public static void valEx(int i) {

        i = i + 10;
        System.out.println(i);
    }
}
