package my_scanner_with_input;

import java.util.Scanner;

public class Demo_Scanner {
    public  void inputMethod(){

        Scanner Scanner = new Scanner(System.in);// created object of Scanner class
        System.out.println("please inter your name ");
        String name = Scanner.nextLine();// this method will read String input and give you
        System.out.println(" you have enter name as "+name);

        // reading int input
        System.out.println("Please enter your age  ");
        int age=Scanner.nextInt();// it will read integer value and return
        System.out.println("you have enter age as "+age);

        // reading decimal value
        System.out.println("Please enter your salary ");
        double salary= Scanner.nextDouble();
        System.out.println("you have enter salary as "+salary);
    }

    public static void main(String[] args) {
        Demo_Scanner obj=new Demo_Scanner();
        obj.inputMethod();
    }

}
