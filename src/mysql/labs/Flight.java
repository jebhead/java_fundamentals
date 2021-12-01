package mysql.labs;

public class Flight {

    private String passName;
    private int fltId;
    private int fromAp;
    private String city;
    private String fltDay;

    @Override
    public String toString() {
        return "Flight{" +
                "passName='" + passName + '\'' +
                ", fltId=" + fltId +
                ", fromAp=" + fromAp +
                ", city='" + city + '\'' +
                ", fltDay='" + fltDay + '\'' +
                '}';
    }

    public Flight(String passName, int fltId, int fromAp, String city, String fltDay) {
        this.passName = passName;
        this.fltId = fltId;
        this.fromAp = fromAp;
        this.city = city;
        this.fltDay = fltDay;
    }

    public Flight() {}

    public String getPassName() {
        return passName;
    }

    public void setPassName(String passName) {
        this.passName = passName;
    }

    public int getFltId() {
        return fltId;
    }

    public void setFltId(int fltId) {
        this.fltId = fltId;
    }

    public int getFromAp() {
        return fromAp;
    }

    public void setFromAp(int fromAp) {
        this.fromAp = fromAp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFltDay() {
        return fltDay;
    }

    public void setFltDay(String fltDay) {
        this.fltDay = fltDay;
    }
}
