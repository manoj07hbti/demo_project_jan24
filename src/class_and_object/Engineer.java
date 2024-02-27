package class_and_object;

public class Engineer {

    String Name = "Nitin";
    String Branch = "Electrical";
    String Location = "Mumbai";
    String Designation = "Executive Engineer";
    int empid = 677;

    public static void main(String[] args) {

        Engineer obj1 = new Engineer();

        System.out.println("Printing obj1 Name :"+obj1.Name);
        System.out.println("Printing obj1 Branch :"+obj1.Branch);
        System.out.println("Printing obj1 Location :"+obj1.Location);
        System.out.println("Printing obj1 Designation :"+obj1.Designation);
        System.out.println("Printing obj1 empid :"+obj1.empid);



    }




}
