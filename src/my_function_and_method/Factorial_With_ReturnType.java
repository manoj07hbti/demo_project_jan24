package my_function_and_method;

public class Factorial_With_ReturnType {
    public int Factorial(int a){
        int Fact=1;
        for(int i=1;i<=a;i++) {
            Fact = Fact *i;
        }
        return Fact;
    }
    public static void main(String[] args) {
        Factorial_With_ReturnType obj=new Factorial_With_ReturnType();
        int number= obj.Factorial(7);
        System.out.println("We Are Printing Factorial of N Number :"+number);
    }

}
