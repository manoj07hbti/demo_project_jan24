package my_function_and_method;

public class Prime_Number {
    public void prime(){
        int num = 29;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

    }

    public static void main(String[] args) {
     Prime_Number obj=new Prime_Number();
     obj.prime();
    }
}
