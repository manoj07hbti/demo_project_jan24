package Collection.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Employee {
    String name ;
    int id;
    char Gender;
    int mobile;

    public Employee(String name, int id, char gender, int mobile) {
        this.name = name;
        this.id = id;
        this.Gender = gender;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char gender) {
        this.Gender = gender;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
}
class UserEmp{
    private void Emp(){
    HashMap<String,ArrayList<Employee>> employeeHashMap=new HashMap<>();
    ArrayList<Employee> Dept_A=new ArrayList<>();
    ArrayList<Employee> Dept_B=new ArrayList<>();
    Employee employee1=new Employee("Arjun",420,'M',1088686777);
    Employee employee2=new Employee("Akash",421,'M',1089986787);
    Employee employee3=new Employee("Azad",422,'M',1088967017);
    Employee employee4=new Employee("Ahmad",423,'M',1088687647);
    Employee employee5=new Employee("Adnan",424,'M',1388686645);
    Employee employee6=new Employee("Akram",425,'M',1874598994);

    Dept_A.add(employee1);
    Dept_A.add(employee2);
    Dept_A.add(employee3);
    Dept_B.add(employee4);
    Dept_B.add(employee5);
    Dept_B.add(employee6);

    employeeHashMap.put("A",Dept_A);
    employeeHashMap.put("B",Dept_B);
      for (String employee:employeeHashMap.keySet()){
          for (Employee employee7:employeeHashMap.get(employee)){
              System.out.println("=====================================");
              System.out.println(" Name : "+employee7.getName()+"\n Id : "+employee7.getId()+"\n Gender : "+employee7.getGender()+
                      "\n Mobile : "+employee7.getMobile());
          }
      }
    }

    public static void main(String[] args) {
        UserEmp userEmp=new UserEmp();
        userEmp.Emp();
    }
}
