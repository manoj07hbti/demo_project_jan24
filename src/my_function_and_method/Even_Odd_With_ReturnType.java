package my_function_and_method;

public class Even_Odd_With_ReturnType {
    public String eve_and_odd(int number) {
        if (number % 2 == 0) {
            return "This Is Even Number:"+number;
        } else{
            return "This Is Odd Number:"+number;
        }
    }

    public static void main(String[] args) {
        Even_Odd_With_ReturnType obj=new Even_Odd_With_ReturnType();
        String eve_and_odd= obj.eve_and_odd(12);
        System.out.println(eve_and_odd);
    }

}



