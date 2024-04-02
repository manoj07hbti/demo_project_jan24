package Test.Test_11_2_2024;

public class Voter_eligibility_check {
    public static void main(String[] args) {

        String state = "Pune";
        int age = 17;

        if ( state == "Pune"){
            if (age >=18 ){
                System.out.println("You are eligible to vote in Pune ");
            }else {
                System.out.println("you belongs to pune but under age ");
            }
        }
        System.out.println("You are not eligible to vote in Pune");
    }
}
