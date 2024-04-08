package collection.hash_Map;

import model.EmployeeData;

import java.util.ArrayList;

public class EmployeeDataHashMap {

    // Employee : id , name , salary record
    //  IBM  and TCS  (Print Salary > 45000

    public static void main(String[] args) {
        EmployeeData emp1 = new EmployeeData(1102, "Aman", 25700.45);
        EmployeeData emp2 = new EmployeeData(1234, "Vinit", 40020.22);
        EmployeeData emp3 = new EmployeeData(7637, "Arjun", 66955.41);
        EmployeeData emp4 = new EmployeeData(1632, "Selja", 34511.91);
        EmployeeData emp5 = new EmployeeData(4405, "Sunit", 54111.22);
        EmployeeData emp6 = new EmployeeData(5311, "Vimal", 33121.33);
        EmployeeData emp7 = new EmployeeData(1233, "Chuhan", 31110.22);
        EmployeeData emp8 = new EmployeeData(2214, "Naresh", 88110.66);
        EmployeeData emp9 = new EmployeeData(1321, "lavkesh", 42100.75);
        EmployeeData emp10 = new EmployeeData(4411, "Gautam", 13350.53);
        EmployeeData emp11 = new EmployeeData(4412, "Dev", 55123.09);
        EmployeeData emp12 = new EmployeeData(3114, "Lakash", 4182.77);
        EmployeeData emp13 = new EmployeeData(7217, "Manish", 41033.87);
        EmployeeData emp14 = new EmployeeData(6612, "Saurabh", 34511.91);
        EmployeeData emp15 = new EmployeeData(3165, "Omendra", 51001.66);
        EmployeeData emp16 = new EmployeeData(5001, "Pravendra", 31814.45);
        EmployeeData emp17 = new EmployeeData(7063, "Yatendra", 71081.73);
        EmployeeData emp18 = new EmployeeData(1064, "Imran", 34110.66);
        EmployeeData emp19 = new EmployeeData(7091, "Elivish", 44100.74);
        EmployeeData emp20 = new EmployeeData(8001, "Tapish", 91350.53);


        ArrayList<EmployeeData> IBM = new ArrayList<>();
        IBM.add(emp1);
        IBM.add(emp2);
        IBM.add(emp4);
        IBM.add(emp5);
        IBM.add(emp6);
        IBM.add(emp7);
        IBM.add(emp8);
        IBM.add(emp9);
        IBM.add(emp10);

        ArrayList<EmployeeData> TCS = new ArrayList<>();
        TCS.add(emp11);
        TCS.add(emp12);
        TCS.add(emp13);
        TCS.add(emp14);
        TCS.add(emp15);
        TCS.add(emp16);
        TCS.add(emp17);
        TCS.add(emp18);
        TCS.add(emp19);
        TCS.add(emp20);


        for (EmployeeData employe : IBM) {
            if (employe.getSalary() >= 45000) {
                System.out.println("Printing Employee List Behalf of IBM Salary"+employe.getName());
            }
        }

        for (EmployeeData employ : TCS) {
            if (employ.getSalary() >= 45000) {
                System.out.println("Printing Employee List Behalf of TCS Salary"+employ.getName());

            }

        }
    }
}