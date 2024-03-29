package model;

import java.util.Objects;

public class Doctor {

    String Name ;
    String MobileNo;
    String Location;
    String Specialist;

    // override hashcode and equals method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Name.equals(doctor.Name) && MobileNo.equals(doctor.MobileNo) && Location.equals(doctor.Location) && Specialist.equals(doctor.Specialist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, MobileNo, Location, Specialist);
    }


    // param Construction;


    public Doctor(String name, String mobileNo, String location, String specialist) {
        Name = name;
        MobileNo = mobileNo;
        Location = location;
        Specialist = specialist;
    }

    // getter and setter


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getSpecialist() {
        return Specialist;
    }

    public void setSpecialist(String specialist) {
        Specialist = specialist;
    }
}
