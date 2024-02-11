package Test_11_2_2024;

public class Age_Checker {
    public static void main(String[] args) {

        int age = 34;

        if (age >= 60 ){
            System.out.println("Old age ");
        } else if (age >= 18 || age <= 40 ) {
            System.out.println("young");
        } else if (age  >0 || age < 18) {
            System.out.println("Child");
        }else {
            System.out.println("not existed");
        }
    }
}
