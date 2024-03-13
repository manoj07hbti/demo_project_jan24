package scanner_with_input;

import java.util.Scanner;

public class CalculatorApp {

    public int add(int a,int b){

        return a+b;
    }

    public int sub(int a,int b){

        return a-b;
    }

    public int multi(int a,int b){

        return a*b;
    }

    public double divide(int a,int b){

        return (double) a/b;
    }

    public static void main(String[] args) {
        CalculatorApp obj= new CalculatorApp();
        int result=0;
        Scanner scanner= new Scanner(System.in);

        String userInput="Y";
        while(userInput.equals("Y")){



            System.out.println("Please enter value of a: ");
            int a=scanner.nextInt();
            System.out.println("Please enter value of b: ");
            int b=scanner.nextInt();
            //TODO we should have option to select which operation you want to perform abd based on user choice out put should come
            System.out.println("Please enter 1: Add , 2 :sub, 3:multi and 4:Divide ");
            //TODO it should repeatedly ask for choice and based on choice it should exit the program otherwise keep asking for choice of calculator
            int choice=scanner.nextInt();

            switch (choice){
                case 1: result=obj.add(a,b);
                    System.out.println("Addition is :"+result);
                    break;
                case 2: result=obj.sub(a,b);
                    System.out.println("Subtraction is :"+result);
                    break;
                case 3: result=obj.multi(a,b);
                    System.out.println("Multi is :"+result);
                    break;
                case 4: double divide=obj.divide(a,b);
                    System.out.println("Divide is :"+divide);
                    break;
                default:
                    System.out.println("Invalid choice entered...Please enter 1,2,3, or 4 only. ");
            }


            System.out.println("Please enter Y to continue or press any other to key for EXIT from App...");
            Scanner scanner2= new Scanner(System.in);
            userInput=scanner2.nextLine();

        }

        }





}
