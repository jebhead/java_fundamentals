package labs_examples.objects_classes_methods.labs.objects;

public class Members {

    public static void main(String[] args) {

        Member m1 = new Member("Bill", "Gold");
        Member m2 = new Member("Kathy", 35, "Silver");
        Member m3 = new Member("Kim", 28, "Bronze", 2009);

        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());

        System.out.println(m3.getFirstYear() + " " + m3.getName());

    }
}

class Member {

    private String name;
    private int age;
    private String mType;
    private int firstYear;

    public Member(String name, String mType) {
        this.name = name;
        this.mType = mType;
    }

    public Member(String name, int age, String mType) {
        this.name = name;
        this.age = age;
        this.mType = mType;
    }

    public Member(String name, int age, String mType, int firstYear) {
        this.name = name;
        this.age = age;
        this.mType = mType;
        this.firstYear = firstYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public int getFirstYear() {
        return firstYear;
    }

    public void setFirstYear(int firstYear) {
        this.firstYear = firstYear;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mType='" + mType + '\'' +
                ", firstYear=" + firstYear +
                '}';
    }
}
