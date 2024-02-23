package variables;

public class VariableDay3 {
    public static void main(String[] args) {

//        // POST INCREMENT OPERATOR VARIABLE++ = VARIABLE+1

        int i=0;
        System.out.println("Printing p before ++ operator :"+i);
        i++; // post increment

        System.out.println("Printing p after ++ operator :"+i);


        // decrement operator
        int j=4;
        j--;

        System.out.println("printing k :"+j);


        int a=4;
        int b=9;

        // SYNTEX : a operator=b;   =>a=a operator b

        a+=b;    // a=a+b;
        System.out.println("Printing a : "+a);
        a*=b;  // a=a*b;
        System.out.println("Printing b :"+a);

        int x=8;
        int y=3;
        int result =x%y;
        System.out.println("Result is : "+result);



    }
}
