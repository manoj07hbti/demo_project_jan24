package my_collection_with_array_list;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeData {

    public static void main(String[] args) {
        // create HashMap which will store employee data
        HashMap<String, ArrayList<model.EmployeeData>> stringArrayListHashMap = new HashMap<>();
        // we need create data for multiple employee
        ArrayList<model.EmployeeData> ibmEmployees=new ArrayList<>();
        ArrayList<model.EmployeeData> tcsEmployees=new ArrayList<>();
        ArrayList<model.EmployeeData> imfEmployees=new ArrayList<>();

        model.EmployeeData employeeData1=new model.EmployeeData(1, "Rajesh",30000.4);
        model.EmployeeData employeeData2=new model.EmployeeData(2, "Raul", 60000.5);
        model.EmployeeData employeeData3=new model.EmployeeData(3 ,"Pratap", 55000.3);
        model.EmployeeData employeeData4=new model.EmployeeData(4, "Gaurav", 40000.34);
        model.EmployeeData employeeData5=new model.EmployeeData(5 ,"mukesh", 65000.23);
        model.EmployeeData employeeData6=new model.EmployeeData(6 , "Omi", 64000.24);
        model.EmployeeData employeeData7=new model.EmployeeData(7 , "vivek", 70000.23);
        model.EmployeeData employeeData8=new model.EmployeeData(8, "Kumar", 34000.12);
        model.EmployeeData employeeData9=new model.EmployeeData(9, "Lalit", 25000.12);
        model.EmployeeData employeeData10=new model.EmployeeData(10 ,"Govind",44000.43);

        model.EmployeeData employeeData11=new model.EmployeeData(1, "Raju",30000.21);
        model.EmployeeData employeeData12=new model.EmployeeData(2, "komal", 60000.36);
        model.EmployeeData employeeData13=new model.EmployeeData(3 ,"Pramod", 55000.77);
        model.EmployeeData employeeData14=new model.EmployeeData(4, "Gargi", 40000.65);
        model.EmployeeData employeeData15=new model.EmployeeData(5 ,"Monu", 65000.45);
        model.EmployeeData employeeData16=new model.EmployeeData(6 , "omkar", 64000.657);
        model.EmployeeData employeeData17=new model.EmployeeData(7 , "vikesh", 70000.545);
        model.EmployeeData employeeData18=new model.EmployeeData(8, "kamini", 34000.65);
        model.EmployeeData employeeData19=new model.EmployeeData(9, "lala", 25000.88);
        model.EmployeeData employeeData20=new model.EmployeeData(10 ,"geeta",44000.98);

        model.EmployeeData employeeData21=new model.EmployeeData(1,  "Rudra",30000.35);
        model.EmployeeData employeeData22=new model.EmployeeData(2,  "Ramkesh", 60000.53);
        model.EmployeeData employeeData23=new model.EmployeeData(3 , "Pati", 55000.34);
        model.EmployeeData employeeData24=new model.EmployeeData(4,  "Garima", 40000.0);
        model.EmployeeData employeeData25=new model.EmployeeData(5 , "Mohan", 65000.0);
        model.EmployeeData employeeData26=new model.EmployeeData(6 , "o.p", 64000.0);
        model.EmployeeData employeeData27=new model.EmployeeData(7 , "Vinesh", 70000.9);
        model.EmployeeData employeeData28=new model.EmployeeData(8,  "Kartar", 34000.0);
        model.EmployeeData employeeData29=new model.EmployeeData(9,  "Love kush", 25000.67);
        model.EmployeeData employeeData30=new model.EmployeeData(10 , "God",44000.0);

        ibmEmployees.add(employeeData1);
        ibmEmployees.add(employeeData2);
        ibmEmployees.add(employeeData3);
        ibmEmployees.add(employeeData4);
        ibmEmployees.add(employeeData5);
        ibmEmployees.add(employeeData6);
        ibmEmployees.add(employeeData7);
        ibmEmployees.add(employeeData8);
        ibmEmployees.add(employeeData9);
        ibmEmployees.add(employeeData10);


        tcsEmployees.add(employeeData11);
        tcsEmployees.add(employeeData12);
        tcsEmployees.add(employeeData13);
        tcsEmployees.add(employeeData14);
        tcsEmployees.add(employeeData15);
        tcsEmployees.add(employeeData16);
        tcsEmployees.add(employeeData17);
        tcsEmployees.add(employeeData18);
        tcsEmployees.add(employeeData19);
        tcsEmployees.add(employeeData20);

        imfEmployees.add(employeeData21);
        imfEmployees.add(employeeData22);
        imfEmployees.add(employeeData23);
        imfEmployees.add(employeeData24);
        imfEmployees.add(employeeData25);
        imfEmployees.add(employeeData26);
        imfEmployees.add(employeeData27);
        imfEmployees.add(employeeData28);
        imfEmployees.add(employeeData29);
        imfEmployees.add(employeeData30);

        stringArrayListHashMap.put("IBM",ibmEmployees);
        stringArrayListHashMap.put("TCS",tcsEmployees);
        stringArrayListHashMap.put("IMF",imfEmployees);

        for (String var : stringArrayListHashMap.keySet()){
            if(var.equals("IBM")){
                ArrayList<model.EmployeeData> ibm =stringArrayListHashMap.get(var);
                for(model.EmployeeData emp:ibm){
                    System.out.println("printing IBM Data id no:"+emp.getId()+" "+emp.getName()+" "+emp.getSalary());
                }
            }
        }
    }

}
