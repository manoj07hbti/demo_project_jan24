package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInPut {

    private void userStoringNames(){
        Scanner scanner =new Scanner(System.in);
        ArrayList<String > name =new ArrayList<>();
        System.out.println("Enter number of element want to store : ");
        int num =scanner.nextInt();
        System.out.println("Enter Names to store : ");
        for (int i =0 ;i<=num;i++){
              String Add =scanner.nextLine();
              name.add(Add);
           }
        System.out.print("======Printing names====");
        for (String var:name){
            System.out.println(var);
        }
    }

    private void userStoringDouble(){
        Scanner scanner =new Scanner(System.in);
        ArrayList<Double> doubles = new ArrayList<>();
            System.out.println("Enter number of element want to store : ");
            int num =scanner.nextInt();
            System.out.println("Enter double values : ");
            for (int u =0 ;u<num;u++){
                double addi =scanner.nextDouble();
                doubles.add(addi);
            }

            System.out.print("======Printing Values====");
            for (double var:doubles) {
                System.out.println(var);
            }


    }
    private void userStoringInt(){
        Scanner scanner =new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
            System.out.println("Enter number of element want to store : ");
            int num =scanner.nextInt();
            System.out.println("Enter int values : ");
            for (int i =0 ;i<num;i++){
                int Ad =scanner.nextInt();
                integers.add(Ad);
            }
            System.out.print("======Printing Values====");
            for (int var:integers){
                System.out.println(var);
            }
    }



    public static void main(String[] args) {
        UserInPut userInPut = new UserInPut();
            String input = "Y";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.storing and printing names");
            System.out.println("2.storing and printing double");
            System.out.println("3.storing and printing integers");
            System.out.println("Enter option : ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    userInPut.userStoringNames();
                    break;
                case 2:
                    userInPut.userStoringDouble();
                    break;
                case 3:
                    userInPut.userStoringInt();
                    break;
                default:
                    System.out.println("entered wrong input");
            }scanner.nextLine();
            System.out.println("To continue enter y");
            input = scanner.nextLine();
        } while (input.equalsIgnoreCase("Y"));
    }
}
