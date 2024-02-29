package class_and_object;public class Employes {

    // properties : data member
    String name="PANKAJ SINGH";

    String post="MANAGER";

    String location="Delhi";

    double salary= 78688.60;

    int empID=5421;


    public static void main(String[] args) {

        // ClassName objName= new ClassName(); // default Constructor

        Employes empl1 = new Employes();

        System.out.println("Printing Employee Name :" +empl1.name + " post :" +empl1.post + " location:" +empl1.location + " Salary:" + empl1.salary + " empID:" + empl1.empID);
    }



}
