package ConditionalStatements;

public class Operators {
    public static void main(String[] args) {
        int p = 7;
        int o = 10;
        p++;
        o--;
        System.out.println("this is increement operator = "+ p+"\n"+"This is decreement operator = " +o);

        int b=9;
        int n=85454;
        int rem=n%b;
        System.out.println("This is  Modulus Operator ="+  rem);


        int m =34667;
        int l =7;

        double per=(double) m*l/100;
        System.out.println("This is percentage of given number = " + per);

        System.out.println("Pyramid pattern");

        System.out.println("*"+"\n"+"**"+"\n"+"***"+"\n"+"****"+"\n"+"*****"+"\n"+"******");


        System.out.println("============="+"\n"+"===========");

        System.out.println("Pyramid pattern inverse");

        System.out.println("*********"+"\n"+" *******"+"\n"+"  *****"+"\n"+"   ***"+"\n"+"    *"

        +"\n");


        System.out.println("Pyramid pattern with gap"+"\n");
        System.out.println( "       *"  +   "\n"+"      * * "+"\n"+"    *  *  *    "+"\n"+"   *  *  *  *    "+"\n"+" *   *  *  *  * ");


        // a operator=b;  => a=a operator b

        System.out.println("\n"+"operators" + "\n");
        int c=4;
        int v=5;

        c+=v;
        System.out.println(c);
        c*=v;
        System.out.println(c);

        c/=v;
        System.out.println(c);

        c-=v;
        System.out.println(c);



    }
}
