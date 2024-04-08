package collection;

import function_or_method.Employee2;
import model.Employee1;

import java.util.ArrayList;

public class EmpData{

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

        Employee1 employee1 =new Employee1("Rishi",76226, 1);
        Employee1 employee2 =new Employee1("Rajat",35620 , 2);
        Employee1 employee3 =new Employee1("Ankur",68633 , 3);
        Employee1 employee4 =new Employee1("Deepak",53165 , 4);
        Employee1 employee5 =new Employee1("Depesh",15166 , 5);
        Employee1 employee6 =new Employee1("Saurabh",18215 , 6);
        Employee1 employee7 =new Employee1("Nitin",15448 , 7);
        Employee1 employee8 =new Employee1("Pankaj",83866 , 8);
        Employee1 employee9 =new Employee1("Anoop",91466 , 9);
        Employee1 employee10 =new Employee1("Amit",35000 , 10);

        ArrayList<Employee1> IBM = new ArrayList<>();
        IBM.add(employee1); IBM.add(employee2); IBM.add(employee3); IBM.add(employee4); IBM.add(employee5);
        IBM.add(employee6); IBM.add(employee7); IBM.add(employee8); IBM.add(employee9); IBM.add(employee10);

        // TCS EMPLOYEE DATA LIST

        Employee1 employee11 =new Employee1("Rahul",66266, 11);
        Employee1 employee12 =new Employee1("Tridesh",26622 , 12);
        Employee1 employee13 =new Employee1("Sumit",48633 , 13);
        Employee1 employee14 =new Employee1("Vijay",43165 , 14);
        Employee1 employee15 =new Employee1("Vipin",25166 , 15);
        Employee1 employee16 =new Employee1("Kumar",68215 , 16);
        Employee1 employee17 =new Employee1("Santosh",85448 , 17);
        Employee1 employee18 =new Employee1("Ravi",43866 , 18);
        Employee1 employee19 =new Employee1("Dhiraj",10466 , 19);
        Employee1 employee20 =new Employee1("Ram",15000 , 20);

        ArrayList<Employee1> TCS = new ArrayList<>();
        TCS.add(employee11); TCS.add(employee12); TCS.add(employee13); TCS.add(employee14); TCS.add(employee15);
        TCS.add(employee16); TCS.add(employee17); TCS.add(employee18); TCS.add(employee19); TCS.add(employee20);

        // INFOSYS EMPLOYEE DATA LIST

        Employee1 employee21 =new Employee1("SIta",452266, 21);
        Employee1 employee22 =new Employee1("Shruti",45622 , 22);
        Employee1 employee23 =new Employee1("Shivani",12633 , 23);
        Employee1 employee24 =new Employee1("Neeru",43165 , 24);
        Employee1 employee25 =new Employee1("Renu",15166 , 25);
        Employee1 employee26 =new Employee1("Preeti",19215 , 26);
        Employee1 employee27 =new Employee1("Swati",48448 , 27);
        Employee1 employee28 =new Employee1("Manisha",82866 , 28);
        Employee1 employee29 =new Employee1("Anshu",99466 , 29);
        Employee1 employee30 =new Employee1("Laxmi",99000 , 30);

        ArrayList<Employee1> INFOSYS = new ArrayList<>();
        INFOSYS.add(employee21); INFOSYS.add(employee22); INFOSYS.add(employee23); INFOSYS.add(employee24); INFOSYS.add(employee25);
        INFOSYS.add(employee26); INFOSYS.add(employee27); INFOSYS.add(employee28); INFOSYS.add(employee29); INFOSYS.add(employee30);

        for (Employee1 em: IBM){
            if (em.getSalary()>=45000){
                System.out.println("Printing Company Employee List In the Base Of IBM Salary  :"+em.getName());
            }
        }

        for (Employee1 em: TCS){
            if (em.getSalary()>=45000){
                System.out.println("Printing Company Employee List In the Base Of TCS Salary :"+em.getName());
            }
        }



    }














}





