package labs_examples.objects_classes_methods.oop_demo;

public class Wood {

    String treeSpecies;
    int grainCount;

    @Override
    public String toString() {
        return "Wood{" +
                "treeSpecies='" + treeSpecies +
                ", grainCount=" + grainCount +
                '}';
    }
}
