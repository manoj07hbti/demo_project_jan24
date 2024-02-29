package class_and_object;

public class Engineer {
    //properties : data member
    String name="PANKAJ.K.S";

    String streem="Electrical Engineer";

    String location="Rajasthan";

    double salary=89232.67;

    int empID=1067;


    public static void main(String[] args) {
        Engineer obj1 = new Engineer ();

        System.out.println("Printing Engineer Name :" +obj1.name + " post :" +obj1.streem + " location:" +obj1.location + " Salary:" + obj1.salary + " empID:" + obj1.empID);



    }


}
