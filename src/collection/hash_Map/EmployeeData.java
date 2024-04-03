package collection.hash_Map;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeData {
    public static void main(String[] args) {
        //store employee data with Hashmap
        HashMap<String, ArrayList<model.EmployeeData>> stringArrayListHashMap = new HashMap<>();

        //Employee data store with multiple info
        ArrayList<model.EmployeeData> TCSemployee = new ArrayList<>();
        ArrayList<model.EmployeeData> HCLemployee = new ArrayList<>();
        ArrayList<model.EmployeeData> PWDemployee = new ArrayList<>();


        model.EmployeeData employeeData1 = new model.EmployeeData(1, "Vinay", 47483.22);
        model.EmployeeData employeeData2 = new model.EmployeeData(2, "Anuj", 27678.42);
        model.EmployeeData employeeData3 = new model.EmployeeData(3, "Ravi", 85362.51);
        model.EmployeeData employeeData4 = new model.EmployeeData(4, "Rohit", 52183.11);
        model.EmployeeData employeeData5 = new model.EmployeeData(5, "Virath", 45333.33);


        TCSemployee.add(employeeData1);
        TCSemployee.add(employeeData2);
        TCSemployee.add(employeeData3);
        TCSemployee.add(employeeData4);
        TCSemployee.add(employeeData5);

        HCLemployee.add(employeeData1);
        HCLemployee.add(employeeData2);
        HCLemployee.add(employeeData3);
        HCLemployee.add(employeeData4);
        HCLemployee.add(employeeData5);


        PWDemployee.add(employeeData1);
        PWDemployee.add(employeeData2);
        PWDemployee.add(employeeData3);
        PWDemployee.add(employeeData4);
        PWDemployee.add(employeeData5);


        stringArrayListHashMap.put("TCS", TCSemployee);
        stringArrayListHashMap.put("HCL", HCLemployee);
        stringArrayListHashMap.put("PWD", PWDemployee);


        // using for loops
        for (String key : stringArrayListHashMap.keySet()) {
            if (key.equals("TCS")) {

                ArrayList<model.EmployeeData> TCS = stringArrayListHashMap.get(key);
                for (model.EmployeeData emp : TCS) {
                    System.out.println("printing TCS employee DATA:" + emp.getEmpid() + " " + emp.getName() + " " + emp.getSalary());

                }
            }
        }
    }
}
