package Methods;

public class Employee {

    public static void employee(){
        int id = 1 ;
        String name = "Ramu";
        double weight=5.7;
        long mobile =7084746740L;
        String Bloodgroup = "-Ab";

        System.out.println("=====Employee Details=====");
        System.out.println("Name        : "+name+"\nID No.      : "+id+"\nWeight      : "+weight+"\nMobile      : "+
                           mobile+"\nBlood Group : "+ Bloodgroup);
    }

    public static void main(String[] args) {
        employee();
    }
}
