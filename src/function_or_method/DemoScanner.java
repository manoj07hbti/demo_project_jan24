package function_or_method;

import java.util.Scanner;

public class DemoScanner {

  public void demoStringInput(){

      Scanner scanner=new Scanner(System.in);
      System.out.println("please enter name :");
    String name=scanner.nextLine();
      System.out.println("you have entered : "+name);
  }
  public void demoIntInput(){
      Scanner scanner=new Scanner(System.in);

  }


    public static void main(String[] args) {
        DemoScanner obj=new DemoScanner();
        obj.demoStringInput();
    }

}
