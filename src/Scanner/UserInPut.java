package Scanner;

import java.util.Scanner;

public class UserInPut {

    private int IntInput(int num){
        return num;
    }
    private String StringInPut(String name){
        return name;
    }
    private double DoubleInPut(double marks){
        return marks;
    }
    public static void main(String[] args) {
        UserInPut userInPut =new UserInPut();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ID : ");
        int a = scanner.nextInt();scanner.nextLine();
        int id = userInPut.IntInput(a);

        System.out.println("Enter student name: ");
        String nam = scanner.nextLine();// scanner.nextLine();
        String name = userInPut.StringInPut(nam);

        System.out.println("Enter Student masks : ");
        double mark = scanner.nextDouble();
        double marks = userInPut.DoubleInPut(mark);

        System.out.println("=====Printing Student details====");
        System.out.println("Name : "+name);
        System.out.println("ID  : "+id);
        System.out.println("Marks : "+marks);

        scanner.close();
    }
}
