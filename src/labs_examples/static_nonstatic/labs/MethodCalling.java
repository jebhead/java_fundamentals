package labs_examples.static_nonstatic.labs;

public class MethodCalling {

    public static void method1() {

        method2();

        MethodCalling obj = new MethodCalling();
        obj.method3();

        MethodCalling2.method4();

        MethodCalling2 obj2 = new MethodCalling2();

        obj2.method5();

    }



    public static void method2() {
        System.out.println("Stat M1 calling Stat method 2 same class");
        System.out.println("Also nonStat M3 calling M2 same class");

    }

    public void method3() {

        System.out.println("Stat Method 1 calling non-Stat M3 same class");
        method2();
        MethodCalling2.method4();
        MethodCalling2 obj3 = new MethodCalling2();
        obj3.method5();
    }
}




//1) A static method calling another static method in the same class
//2) A static method calling a non-static method in the same class
//3) A static method calling a static method in another class
//4) A static method calling a non-static method in another class
//5) A non-static method calling a non-static method in the same class
//6) A non-static method calling a non-static method in another class
//7) A non-static method calling a static method in the same class
//8) A non-static method calling a static method in another class