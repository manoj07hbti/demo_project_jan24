package conditional_statements;

public class NOTOperator {

    public static void main(String[] args) {

        int number=4;

        if(!(number%2!=0)){
            System.out.println("Number is EVEN Number...");
        }

        String city="Pune";
        if(city!="Pune"){

            System.out.println("Welcome to App....");
        }else {
            System.out.println("This App is not available in Pune....");
        }



    }
}
