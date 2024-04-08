package collection_array_list.hashmap;

import model.EmployeeD;

import java.util.ArrayList;

public class Employee_Data {

    // TODO Employee : id , name , salary
    //
    //
    //10 record in every company Unique Employee
    //IBM
    //TCS
    //INFOSYS
    //
    //Print only IBM and TCS employee data which is having salary >45000

    public static void main(String[] args) {

        //IBM EMPLOYEE DATA LIST

        EmployeeD employee1 =new EmployeeD("Rakesh",662266, 1);
        EmployeeD employee2 =new EmployeeD("Rajeev",25622 , 2);
        EmployeeD employee3 =new EmployeeD("Ankur",68633 , 3);
        EmployeeD employee4 =new EmployeeD("Deepak",53165 , 4);
        EmployeeD employee5 =new EmployeeD("Depesh",15166 , 5);
        EmployeeD employee6 =new EmployeeD("Saurabh",18215 , 6);
        EmployeeD employee7 =new EmployeeD("Nitin",15448 , 7);
        EmployeeD employee8 =new EmployeeD("Pankaj",83866 , 8);
        EmployeeD employee9 =new EmployeeD("Anoop",91466 , 9);
        EmployeeD employee10 =new EmployeeD("Amit",35000 , 10);

        ArrayList<EmployeeD> IBM = new ArrayList<>();
        IBM.add(employee1); IBM.add(employee2); IBM.add(employee3); IBM.add(employee4); IBM.add(employee5);
        IBM.add(employee6); IBM.add(employee7); IBM.add(employee8); IBM.add(employee9); IBM.add(employee10);

        // TCS EMPLOYEE DATA LIST

        EmployeeD employee11 =new EmployeeD("Rahul",66266, 11);
        EmployeeD employee12 =new EmployeeD("Tridesh",26622 , 12);
        EmployeeD employee13 =new EmployeeD("Sumit",48633 , 13);
        EmployeeD employee14 =new EmployeeD("Vijay",43165 , 14);
        EmployeeD employee15 =new EmployeeD("Vipin",25166 , 15);
        EmployeeD employee16 =new EmployeeD("Kumar",68215 , 16);
        EmployeeD employee17 =new EmployeeD("Santosh",85448 , 17);
        EmployeeD employee18 =new EmployeeD("Ravi",43866 , 18);
        EmployeeD employee19 =new EmployeeD("Dhiraj",10466 , 19);
        EmployeeD employee20 =new EmployeeD("Ram",15000 , 20);

        ArrayList<EmployeeD> TCS = new ArrayList<>();
        TCS.add(employee11); TCS.add(employee12); TCS.add(employee13); TCS.add(employee14); TCS.add(employee15);
        TCS.add(employee16); TCS.add(employee17); TCS.add(employee18); TCS.add(employee19); TCS.add(employee20);

        // INFOSYS EMPLOYEE DATA LIST

        EmployeeD employee21 =new EmployeeD("SIta",452266, 21);
        EmployeeD employee22 =new EmployeeD("Shruti",45622 , 22);
        EmployeeD employee23 =new EmployeeD("Shivani",12633 , 23);
        EmployeeD employee24 =new EmployeeD("Neeru",43165 , 24);
        EmployeeD employee25 =new EmployeeD("Renu",15166 , 25);
        EmployeeD employee26 =new EmployeeD("Preeti",19215 , 26);
        EmployeeD employee27 =new EmployeeD("Swati",48448 , 27);
        EmployeeD employee28 =new EmployeeD("Manisha",82866 , 28);
        EmployeeD employee29 =new EmployeeD("Anshu",99466 , 29);
        EmployeeD employee30 =new EmployeeD("Laxmi",99000 , 30);

        ArrayList<EmployeeD> INFOSYS = new ArrayList<>();
        INFOSYS.add(employee21); INFOSYS.add(employee22); INFOSYS.add(employee23); INFOSYS.add(employee24); INFOSYS.add(employee25);
        INFOSYS.add(employee26); INFOSYS.add(employee27); INFOSYS.add(employee28); INFOSYS.add(employee29); INFOSYS.add(employee30);

        for (EmployeeD em: IBM){
            if (em.getSalary()>=45000){
                System.out.println("Printing Company Employee List In the Base Of IBM Salary  :"+em.getName());
            }
        }

        for (EmployeeD em: TCS){
            if (em.getSalary()>=45000){
                System.out.println("Printing Company Employee List In the Base Of TCS Salary :"+em.getName());
            }
        }



    }


}
