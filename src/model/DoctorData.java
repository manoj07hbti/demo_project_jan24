package model;

public class DoctorData {
    int fees;
    String name;
    Double time;

    public DoctorData(int fees, String name, double time) {
        this.fees = fees;
        this.name = name;
        this.time = time;

    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }
}