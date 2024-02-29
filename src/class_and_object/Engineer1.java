package class_and_object;

public class Engineer1 {
    String Name;
    String Branch;
    String Location;
    String Designation;
    int empId;

    public Engineer1(String name, String branch, String location, String designation, int empId) {
        Name = name;
        Branch = branch;
        Location = location;
        Designation = designation;
        this.empId = empId;
    }

    public static void main(String[] args) {
        Engineer1 Engineer2 = new Engineer1("Nitin", "Electrical", "Mumbai", "Executive Engineer", 677);
        System.out.println("Printing Engineer1 Name:" + Engineer2.Name);
        System.out.println("Printing Engineer1 Branch:" + Engineer2.Branch);
        System.out.println("Printing Engineer1 Location:" + Engineer2.Location);
        System.out.println("Printing Engineer1 Designation:" + Engineer2.Designation);
        System.out.println("Printing Engineer1 empId:" + Engineer2.empId);


    }


}
