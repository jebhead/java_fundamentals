package labs_examples.objects_classes_methods.labs.objects;


class Visit_Control {

    public static void main(String[]args){

        Patient p1 = new Patient(36,"m", 178);
        Patient p2 = new Patient(65,"f", 123);
        Patient p3 = new Patient(43,"f", 114);
        Patient p4 = new Patient(23,"m", 158);

        Disease d1 = new Disease("flu", 6, .003, 14);
        Disease d2 = new Disease("infection", 4, .02, 6);
        Disease d3 = new Disease("injury", 21, .04, 54);
        Disease d4 = new Disease("embolism", 2, .09, 123);

        Doctor dr1 = new Doctor("Peck", 3.23);
        Doctor dr2 = new Doctor("Davis", 4.96);
        Doctor dr3 = new Doctor("Singh", 3.87);

        Visit v1 = new Visit(p1, dr1, d4);
        Visit v2 = new Visit(p4, dr3, d2);
        Visit v3 = new Visit(p1, dr2, d3);
        Visit v4 = new Visit(p1, dr1, d4);
        Visit v5 = new Visit(p1, dr1, d1);

        System.out.println(v1.disease.getDaysToHeal());
        System.out.println(v1.disease.toString());
        System.out.println(v3.doctor.toString());

        System.out.println();

        System.out.println(dr3.toString());
        System.out.println(v1.patient.toString());  //WTF
        System.out.println(d3.toString());
        System.out.println(p3.toString());  //WTF

        double v1Cost = v1.disease.getDoctorTimeMins() * v1.doctor.getCostPerMin();
        double v2Cost = v2.disease.getDoctorTimeMins() * v2.doctor.getCostPerMin();
        double v3Cost = v3.disease.getDoctorTimeMins() * v3.doctor.getCostPerMin();
        double v4Cost = v4.disease.getDoctorTimeMins() * v4.doctor.getCostPerMin();
        double v5Cost = v5.disease.getDoctorTimeMins() * v5.doctor.getCostPerMin();

        System.out.println("Cost of visit 1 " + v1Cost);
        System.out.println("Cost of visit 2 " + v2Cost);
        System.out.println("Cost of visit 3 " + v3Cost);
        System.out.println("Cost of visit 4 " + v4Cost);

        String docName = getV2Doc(v2.doctor);  //Call Method 1

        System.out.println("*********");
        System.out.println("The doc in Visit 2 is " + docName);

        int vAge = getV2PatAge(v2.patient);

        System.out.println(vAge);

        printVisit(v4);
    }

    public static String getV2Doc(Doctor doctor)  {

        String v2DocName = doctor.getLastName();
        return v2DocName;
    }

    public static int getV2PatAge(Patient patient) {

        int v2PatAge = patient.getAge();
        return v2PatAge;
    }

    public static void printVisit(Visit visit) {

        System.out.println(visit.getPatient().getAge() + visit.getDisease().getName());
    }
}

public class Patient {

    private int age;
    private String gender;
    private int weight;

    public Patient(int age, String gender, int weight) {
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class Disease {

    private String name;
    private int daysToHeal;
    private double mortality;
    private int doctorTimeMins;

    public Disease(String name, int daysToHeal, double mortality, int doctorTimeMins) {
        this.name = name;
        this.daysToHeal = daysToHeal;
        this.mortality = mortality;
        this.doctorTimeMins = doctorTimeMins;
    }

    public int getDoctorTimeMins() {
        return doctorTimeMins;
    }

    public void setDoctorTimeMins(int doctorTimeMins) {
        this.doctorTimeMins = doctorTimeMins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysToHeal() {
        return daysToHeal;
    }

    public void setDaysToHeal(int daysToHeal) {
        this.daysToHeal = daysToHeal;
    }

    public double getMortality() {
        return mortality;
    }

    public void setMortality(double mortality) {
        this.mortality = mortality;
    }

    @Override
    public String toString() {
        return "Disease{" +
                "name='" + name + '\'' +
                ", daysToHeal=" + daysToHeal +
                ", mortality=" + mortality +
                ", doctorTimeMins=" + doctorTimeMins +
                '}';
    }
}

class Doctor {

    private String lastName;
    private double costPerMin;

    public Doctor(String lastName, double costPerMin) {
        this.lastName = lastName;
        this.costPerMin = costPerMin;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getCostPerMin() {
        return costPerMin;
    }

    public void setCostPerMin(double costPerMin) {
        this.costPerMin = costPerMin;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "lastName='" + lastName + '\'' +
                ", costPerMin=" + costPerMin +
                '}';
    }
}

class Visit {

    Patient patient;
    Doctor doctor;
    Disease disease;

    public Visit(Patient patient, Doctor doctor, Disease disease) {
        this.patient = patient;
        this.doctor = doctor;
        this.disease = disease;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "patient=" + patient +
                ", doctor=" + doctor +
                ", disease=" + disease +
                '}';
    }
}

