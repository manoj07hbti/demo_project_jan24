package Test.Test_11_2_2024;

public class Nationality_Checker {
    public static void main(String[] args) {
        String nation = "india";
        String state = "maharastra";

        if (nation == "india") {
            if (state == "maharastra") {
                System.out.println("you are an ♥" + nation + "♥ and from ♥" + state+"♥");
            } else {
                System.out.println("You are an ♥Indian♥ but not from ♥maharastra♥");
            }
        }else {
            System.out.println("You are not an indian");
        }
    }
}
