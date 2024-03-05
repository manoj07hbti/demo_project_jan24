package function_or_method;

public class work {



    /*write a code to find even and odd number between 1 to 100*/

    public void oddeven() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }


        }


    }

    public static void main(String[] args) {
        work obj = new work();
        obj.oddeven();
        work obj2 = new work();
        obj2.prime();
        work obj3 = new work();
        obj3.division();
        work obj4 = new work();
        obj4.cube();
    }



    /*write a method to check Prime number*/


    public void prime() {
        int k = 7;
        boolean prime = true;

        for (int i = 2; i < k; i++) {
            if (k % i == 0)
                prime = false;
            break;
        }

        if (prime) System.out.println(k + " is prime");
        else {
            System.out.println(k + " is not prime");
        }
    }

    /*write a method to check division of student based on marks who is having 6 subject*/


    public void division() {

        int sub1 = 85;
        int sub2 = 56;
        int sub3 = 94;
        int sub4 = 96;
        int sub5 = 52;
        int sub6 = 65;

        int sum = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;

        if (sum >= 500) {
            System.out.println("1ts div " + sum);
        } else if (sum >= 400) {
            System.out.println("2nd div " + sum);

        } else if (sum >= 300) {
            System.out.println("3rd div " + sum);

        } else if (sum >= 200) {
            System.out.println("4th");

        } else if (sum >= 100) {
            System.out.println("fail");

        }


    }

    /*1- wrtie a method for cube*/

    public void cube() {
        int c = 5;
        int cube = c * c * c;
        System.out.println(cube + " is the cube of " + c);

    }


}
