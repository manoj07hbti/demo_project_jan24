package function_or_method;

public record Return_type() {
    /*1- write a code to check even or odd number
2. write a code to check prime number
3. write a code to find factorial
4. write calculator
5. write a code to check division of Student
    public double  checkDivision(int totalMarks){
        // formula return output;*/

    /* 1- write a code to check even or odd number*/
    public String evenodd(int num) {
        if (num % 2 == 0) {
            return ("num is even =  " + num);
        } else {
            return ("num is odd =  " + num);
        }
    }



    /*2. write a code to check prime number*/

    public String prime(int num) {

        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) return "num is prime " + num;
        else return "not prime = " + num;
    }

    /*   3. write a code to find factorial*/

    public int fac(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;

    }

    /*  4. write calculator*/

    public int add(int a, int b) {

        int sum = a + b;
        return sum;


    }

    public int sub(int a, int b) {
        int sub = a - b;
        return sub;

    }

    public double divi(double a, double b) {

        double div = a / b;
        return div;
    }

    /*   5. write a code to check division of Student*/

    public String division(double marks) {
        double total = marks / 600 * 100;
        if (total >= 90) return "1st";
        else if (total >= 80) {
            return "2nd";
        } else if (total >= 70) {
            return "3rd";
        } else if (total >= 60) {
            return "4th";
        } else if (total >= 50) {
            return "5th";
        } else if (total < 50) {
            return "failed";
        }


        return null;
    }


    public static void main(String[] args) {
        Return_type obj = new Return_type();

        String result = obj.evenodd(77);
        System.out.println(result);

        String num = obj.prime(11);
        System.out.println(num);


        int num1 = obj.fac(5);
        System.out.println(num1);


        System.out.println(obj.add(45, 21));

        int sub = obj.sub(41, 21);
        System.out.println(sub);

        double div = obj.divi(50, 4);
        System.out.println(div);

        String division = obj.division(450);
        System.out.println(division);

        System.out.println(obj.add(45,75));
    }


}
