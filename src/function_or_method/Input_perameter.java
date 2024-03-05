package function_or_method;

public class Input_perameter {

  /*  access_specifier return_type  method_name (Datatype varName..) {
        CODE..   }
     === access_specifier return_type  method_name (Datatype varName1,Datatype varName2,Datatype varName3..) {
        CODE..   }
     obj.methodName(value1,value2,value3);*/

    /* 1- wrtie a method for cube*/

    public void cubechecker(int number) {

        int cube = number * number * number;
        System.out.println(cube + " is a cube of " + number);
    }

    /*  2- write a method to check Prime number : 9*/

    public void prime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }

    /*   3- calculator*/

    public void add(int a, int b) {

        int sum = a + b;
        int multi = a * b;
        int divide = a / b;
        int sub = a - b;
        System.out.println(sum + "\n" + multi + "\n" + divide + "\n" + sub);
    }

    /* 4- factorial*/

    public void factorial(int number) {
        int f = 1;
        for (int k = 1; k <= number; k++) {
            f = f * k;

        }
        System.out.println(f + " is a factorial of " + number);

    }

    /* 5- calculate percentage*/


    public void per(double a, double b) {
        double per = (a / b) * 100;
        System.out.println(per);


    }


    public static void main(String[] args) {
        Input_perameter obj = new Input_perameter();
        obj.cubechecker(5);
        obj.prime(11);
        obj.add(8, 5);
        obj.factorial(5);
        obj.per(50, 500);


    }


}
