package model;

import java.util.Objects;

public class Engineer {

    String Name;
    String Branch;
    String Location;
    String Designation;

    // override hashcode and equals method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return Name.equals(engineer.Name) && Branch.equals(engineer.Branch) && Location.equals(engineer.Location) && Designation.equals(engineer.Designation);
    }
    @Override
    public int hashCode() {
        return Objects.hash(Name, Branch, Location, Designation);
    }








    // param Construction

    public Engineer(String name, String branch, String location, String designation) {
        Name = name;
        Branch = branch;
        Location = location;
        Designation = designation;
    }





    // getter and setter
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }
}
