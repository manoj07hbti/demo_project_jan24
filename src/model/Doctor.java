package model;

import java.util.Objects;

public class Doctor {

    String Name ;
    String Mobile;
    String Address;
    String Specialist;



    // Use override hashcode with equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Name.equals(doctor.Name) && Mobile.equals(doctor.Mobile) && Address.equals(doctor.Address) && Specialist.equals(doctor.Specialist);
    }
    @Override
    public int hashCode() {
        return Objects.hash(Name, Mobile, Address, Specialist);
    }










    // param Construction;
    public Doctor(String name, String mobile, String Address, String specialist) {
        Name = name;
        Mobile = mobile;
        Address = Address;
        Specialist = specialist;
    }

    // Use  with getter and setter


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMobileNo() {
        return Mobile;
    }

    public void setMobileNo(String mobileNo) {
        Mobile = mobileNo;
    }

    public String getLocation() {
        return Address;
    }

    public void setLocation(String location) {
        Address = Address;
    }

    public String getSpecialist() {
        return Specialist;
    }

    public void setSpecialist(String specialist) {
        Specialist = specialist;
    }
}
