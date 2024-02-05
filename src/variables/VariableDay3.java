package variables;

public class VariableDay3 {

    public static void main(String[] args) {

        // POST INCREMENT OPERATOR VARIABLE++ = VARIABLE+1

        int i=0;
        System.out.println("Printing i before ++ operator : "+i);
        i++; // post increment
        System.out.println("Printing i after ++ operator : "+i);

        // decrement operator
        int j=5;
        j--;

        System.out.println("Printing j: "+j);

        int a=3;
        int b=7;

        //SYNTAX:   a operator=b;  => a=a operator b

        a+=b;   // a=a+b;
        System.out.println("Printing a: "+a);// a=10
        a*=b; // a=a*b;
        System.out.println("Printing a: "+a);

        int x=5;
        int y=4;

        int result= x%y;
        System.out.println("Result is: "+result);

        boolean flag=true;

        System.out.println("Printing flag: "+flag);


    }
}
