package HashMap.adv;

import model.Employee;

import java.util.ArrayList;

public class ass2 {
  /*  Employee : id , name , salary  10 record in every company Unique Employee
  1.IBM 2.TCS 3.INFOSYS= Print only IBM and TCS employee data which is having salary >45000*/

    public static void main(String[] args) {
        Employee emp1 =new Employee("rahul",524155);
        Employee emp2 =new Employee("rahul1",5155);
        Employee emp3 =new Employee("rahul2",555);
        Employee emp4 =new Employee("rahul3",5241);
        Employee emp5 =new Employee("rahul4",524155);
        Employee emp6 =new Employee("rahul5",5249);
        Employee emp7 =new Employee("rahul6",524155);
        Employee emp8 =new Employee("rahul7",524);
        Employee emp9 =new Employee("rahul8",524155);
        Employee emp10 =new Employee("rahul9",5245);

        Employee emp11 =new Employee("rahul11",524155);
        Employee emp12=new Employee("rahul12",5255);
        Employee emp13 =new Employee("rahul13",5241);
        Employee emp14 =new Employee("rahul14",524155);
        Employee emp15 =new Employee("rahul15",525);
        Employee emp16 =new Employee("rahul16",524155);
        Employee emp17 =new Employee("rahul17",5245);
        Employee emp18 =new Employee("rahul18",525);
        Employee emp19 =new Employee("rahul19",524155);
        Employee emp20 =new Employee("rahul20",52415);

        Employee emp21 =new Employee("rahul21",5255);
        Employee emp22 =new Employee("rahul22",524155);
        Employee emp23 =new Employee("rahul23",525);
        Employee emp24 =new Employee("rahul24",524155);
        Employee emp25 =new Employee("rahul25",525);
        Employee emp26 =new Employee("rahul26",5245);
        Employee emp27 =new Employee("rahul27",524155);
        Employee emp28 =new Employee("rahul28",525);
        Employee emp29 =new Employee("rahul29",524155);
        Employee emp30 =new Employee("rahul30",5255);

        ArrayList<Employee> IBM = new ArrayList<>();
        IBM.add(emp1); IBM.add(emp2); IBM.add(emp3); IBM.add(emp4); IBM.add(emp5);
        IBM.add(emp6); IBM.add(emp7); IBM.add(emp8); IBM.add(emp9); IBM.add(emp10);

        ArrayList<Employee> TCS = new ArrayList<>();
        TCS.add(emp11); TCS.add(emp12); TCS.add(emp13); TCS.add(emp14); TCS.add(emp15);
        TCS.add(emp16); TCS.add(emp17); TCS.add(emp18); TCS.add(emp19); TCS.add(emp20);

        ArrayList <Employee>Infosys = new ArrayList<>();
        Infosys.add(emp21); Infosys.add(emp22); Infosys.add(emp23); Infosys.add(emp24); Infosys.add(emp25);
        Infosys.add(emp26); Infosys.add(emp27); Infosys.add(emp28); Infosys.add(emp29); Infosys.add(emp30);

        for (Employee em: IBM){
            if (em.getSalary()>=45000){
                System.out.println(em.getName());
            }
        }

        for (Employee em: TCS){
            if (em.getSalary()>=45000){
                System.out.println(em.getName());
            }
        }





    }


}
