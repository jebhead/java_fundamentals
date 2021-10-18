package labs_examples.generics.labs;

public class GenClass1<T> {

    private T objex11;
    private T objex12;

    public GenClass1(T objex11, T objex12) {
        this.objex11 = objex11;
        this.objex12 = objex12;
    }

    public T getObjex11() {
        return objex11;
    }

    public void setObjex11(T objex11) {
        this.objex11 = objex11;
    }

    public T getObjex12() {
        return objex12;
    }

    public void setObjex12(T objex12) {
        this.objex12 = objex12;
    }

    @Override
    public String toString() {
        return "GenClass1{" +
                "objex11=" + objex11 +
                ", objex12=" + objex12 +
                '}';
    }
}
