package function_or_method;

public class FactorialRT {

    public int factorial(int a){
        int z=1;
        for (int i=1;i<a;i++){
            z =z*i;
        }
        return z;
    }public static void main (String []args){
      FactorialRT object= new FactorialRT() ;
      int number= object.factorial(8);
        System.out.println("Printing a Factorial NO :"+number);
    }


}
