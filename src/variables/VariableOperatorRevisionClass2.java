package variables;

public class VariableOperatorRevisionClass2 {

    public static void main(String[] args) {

        //SYNTAX: a operator=b;  => a=a operator b

        int a=5;
        int b=9;

        a+=b; // a=a+b;

        System.out.println("Printing a :"+a); // a=10
        a*=b; // a=a*b;
        System.out.println("Printing a :"+a);

        int x=9;
        int y=5;
        int result=x%y;
        System.out.println("Printing Result is :"+result);


    }



}
