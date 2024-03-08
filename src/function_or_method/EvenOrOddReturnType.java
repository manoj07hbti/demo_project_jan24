package function_or_method;

public class EvenOrOddReturnType {

    // write a code to check even or odd number

    public String checkevenodd(int number) {
        if (number % 2 == 0) {
        return "This Is Even Number:"+number;
    } else{
            return "This Is Odd Number:"+number;
        }
    }

    public static void main(String[] args) {
        EvenOrOddReturnType obj=new EvenOrOddReturnType();
         String checkevenodd= obj.checkevenodd(2);
        System.out.println(checkevenodd);
    }

}
