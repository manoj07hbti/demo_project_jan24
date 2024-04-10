package Collection.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class User_Employee {
    public static void main(String[] args) {
        User_Employee userEmployee=new User_Employee();
        userEmployee.emp();
    }
    private void emp(){
        Employee employee1=new Employee("Rakesh",1,'M',25000,701474673);
        Employee employee2=new Employee("Arjun",2,'M',30000,601474603);
        Employee employee3=new Employee("Mukesh",3,'M',32000,701404643);
        Employee employee4=new Employee("Rupa",4,'F',34000,788474673);
        Employee employee5=new Employee("Rani",5,'F',36000,881474670);
        Employee employee6=new Employee("Rahul",6,'M',38000,709474073);
        Employee employee7=new Employee("Raju",7,'M',40000,719474671);
        Employee employee8=new Employee("Bheem",8,'M',42000,721474673);
        Employee employee9=new Employee("Kaliya",9,'M',44000,731474672);
        Employee employee10=new Employee("Chutki",10,'F',46000,741474674);

        Employee employee11=new Employee("Krishna",11,'M',48000,851474675);
        Employee employee12=new Employee("Tuntun",12,'F',50000,961474676);
        Employee employee13=new Employee("Jay",13,'M',52000,771474677);
        Employee employee14=new Employee("Veedu",14,'M',54000,781474678);
        Employee employee15=new Employee("Gabbar",15,'M',56000,781474679);
        Employee employee16=new Employee("Thakur",16,'M',58000,701174680);
        Employee employee17=new Employee("Basansti",17,'F',60000,701274673);
        Employee employee18=new Employee("Ramukaka",18,'M',62000,741374670);
        Employee employee19=new Employee("Shambha",19,'M',62000,741374670);
        Employee employee20=new Employee("Kutte",20,'M',62000,741374670);

        Employee employee21=new Employee("Shyam",21,'M',64000,851474675);
        Employee employee22=new Employee("Nirjala",22,'F',66000,961474676);
        Employee employee23=new Employee("Satya",23,'M',68000,771474677);
        Employee employee24=new Employee("Virandar",24,'M',70000,781474678);
        Employee employee25=new Employee("Mani Kanta",25,'M',72000,781474679);
        Employee employee26=new Employee("Madhu",26,'M',74000,701174680);
        Employee employee27=new Employee("Sumanth",27,'F',76000,701274673);
        Employee employee28=new Employee("Ranjan",28,'M',78000,741374670);
        Employee employee29=new Employee("Vishvajeet",29,'M',80000,741374670);
        Employee employee30=new Employee("Amir",30,'M',82000,741374670);

        HashMap<String, ArrayList<Employee>> emp= new HashMap<>();
        ArrayList<Employee>IBMEmployee=new ArrayList<>();
        IBMEmployee.add(employee1);
        IBMEmployee.add(employee2);
        IBMEmployee.add(employee3);
        IBMEmployee.add(employee4);
        IBMEmployee.add(employee5);
        IBMEmployee.add(employee6);
        IBMEmployee.add(employee7);
        IBMEmployee.add(employee8);
        IBMEmployee.add(employee9);
        IBMEmployee.add(employee10);
        ArrayList<Employee>TCSEmployee=new ArrayList<>();
        TCSEmployee.add(employee11);
        TCSEmployee.add(employee12);
        TCSEmployee.add(employee13);
        TCSEmployee.add(employee14);
        TCSEmployee.add(employee15);
        TCSEmployee.add(employee16);
        TCSEmployee.add(employee17);
        TCSEmployee.add(employee18);
        TCSEmployee.add(employee19);
        TCSEmployee.add(employee20);
        ArrayList<Employee>INFOSYSEmployee=new ArrayList<>();
        INFOSYSEmployee.add(employee21);
        INFOSYSEmployee.add(employee22);
        INFOSYSEmployee.add(employee23);
        INFOSYSEmployee.add(employee24);
        INFOSYSEmployee.add(employee25);
        INFOSYSEmployee.add(employee26);
        INFOSYSEmployee.add(employee27);
        INFOSYSEmployee.add(employee28);
        INFOSYSEmployee.add(employee29);
        INFOSYSEmployee.add(employee30);

        emp.put("IBM",IBMEmployee);
        emp.put("TCS",TCSEmployee);
        emp.put("INFOSYS",INFOSYSEmployee);

        for (String employee:emp.keySet()){
            if (employee.equalsIgnoreCase("IBM") ||
                    employee.equalsIgnoreCase("TCS")){
               for (Employee employ : emp.get(employee)) {
                   if (employ.getSalary()>45000) {
                       System.out.println("================================");
                       System.out.println("Name   : " + employ.getName() + "\nID     : " + employ.getId() + "\nSalary : " + employ.getSalary() +
                               "\nGender : " + employ.getGender() + "\nMobile : " + employ.getMobile());
                   }
               }
           }
        }
        System.out.println("================================");
    }
}
