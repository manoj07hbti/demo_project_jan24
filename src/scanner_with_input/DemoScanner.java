package scanner_with_input;

import java.util.Scanner;

public class DemoScanner {
    // this method will take String input into  your program

    public void demoStringInput(){

        // create object  of scanner

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter Your Name :");
        String name =scanner.nextLine(); // it reads String input and given it back
        System.out.println("user has entered :"+name);

    }

    public void demoInIput(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age :");
        int age=scanner.nextInt(); //read integer value and give it back
        System.out.println("Your has enter age as : "+age);
    }


    public void demoDoulbeInput(){
        //create object of scanner
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your salary :");
        double salary= scanner.nextDouble(); //read decimal value and given it back
        System.out.println("User has enter your salary :"+salary);
    }










    public static void main(String[] args) {
        DemoScanner obj = new DemoScanner();
        obj.demoStringInput();
        obj.demoInIput();
        obj.demoDoulbeInput();




    }

}

