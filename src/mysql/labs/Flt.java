package mysql.labs;

public class Flt {

    int fltId;
    int rtID;
    int plID;
    String fltDay;

    public Flt(int fltId, int rtID, int plID, String fltDay) {
        this.fltId = fltId;
        this.rtID = rtID;
        this.plID = plID;
        this.fltDay = fltDay;
    }

    public int getFltId() {
        return fltId;
    }

    public void setFltId(int fltId) {
        this.fltId = fltId;
    }

    public int getRtID() {
        return rtID;
    }

    public void setRtID(int rtID) {
        this.rtID = rtID;
    }

    public int getPlID() {
        return plID;
    }

    public void setPlID(int plID) {
        this.plID = plID;
    }

    public String getFltDay() {
        return fltDay;
    }

    public void setFltDay(String fltDay) {
        this.fltDay = fltDay;
    }

    @Override
    public String toString() {
        return "Flt{" +
                "fltId=" + fltId +
                ", rtID=" + rtID +
                ", plID=" + plID +
                ", fltDay='" + fltDay + '\'' +
                '}';
    }
}
