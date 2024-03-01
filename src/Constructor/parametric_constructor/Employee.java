package Constructor.parametric_constructor;

public class Employee {
    int id;
    String name;
    double weight;
    long mobile;
    String Bloodgroup;

    public Employee(int id, String name, double weight, long mobile, String Bloodgroup) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.mobile = mobile;
        this.Bloodgroup = Bloodgroup;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1,"Atif",45.3,8737837388L,"AB");

        System.out.println("====Employee Details===="+"\nName        : "+employee.name+"\nID No.      : "+employee.id+
             "\nWeight      : "+employee.weight+"\nBlood Group : "+employee.Bloodgroup+"\nMobile      : "+employee.mobile);

        Employee employee1 = new Employee(2,"Arif",54.3,7037837386L,"-AB");

        System.out.println("====Employee Details===="+"\nName        : "+employee1.name+"\nID No.      : "+employee1.id+
            "\nWeight      : "+employee1.weight+"\nBlood Group : "+employee1.Bloodgroup+"\nMobile      : "+employee1.mobile);

    }
}
