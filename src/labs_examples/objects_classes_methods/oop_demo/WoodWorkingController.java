package labs_examples.objects_classes_methods.oop_demo;

public class WoodWorkingController {
    public static void main(String[] args) {
        Wood wood1 = new Wood();
        wood1.grainCount = 48;
        wood1.treeSpecies = "Maple";

        System.out.println("This wood is " + wood1.treeSpecies + " and has grain count of " + wood1.grainCount);
        System.out.println(1);

        Wood wood2 = new Wood();
        wood2.grainCount = 15;
        wood2.treeSpecies = "Cedar";

        System.out.println("This wood is " + wood2.treeSpecies + " and has grain count of " + wood2.grainCount);

        String w1 = wood1.toString();
        String w2 = wood2.toString();
        System.out.println(w1);
        System.out.println(w2);

        Forest forest = new Forest();
        forest.tree1 = wood1;
        forest.tree2 = wood2;
        String s1 = forest.tree1.treeSpecies;
        System.out.println("The species of tree1 in the forest is " + s1);

        String s2 = forest.tree2.treeSpecies;
        System.out.println("The species of tree2 in the forest is " + s2);
    }
}
