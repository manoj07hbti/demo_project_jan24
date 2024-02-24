package conductional_statement_ifandelse;

public class DemoANDOperator3 {
    public static void main(String[] args) {

        // TODO write a code to find eligible voter of UP age state "UP" ?
        int age = 17;
        String State = "UP";
        if (age >= 18 && State == "UP") {
            System.out.println("Voter age is 18 and eligible for vote in UP");
        } else {
            System.out.println("Voter age is Not 18 and Not eligible for vote in UP");
        }
    }
}
