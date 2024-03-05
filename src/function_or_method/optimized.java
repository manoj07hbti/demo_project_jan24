package function_or_method;

public class optimized {


    public record ReturnType() {

        public String checkEvenOdd(int num) {
            return num % 2 == 0 ? "num is even = " + num : "num is odd = " + num;
        }

        public String checkPrime(int num) {
            if (num < 2) return "not prime = " + num;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return "not prime = " + num;
            }
            return "num is prime " + num;
        }

        public int factorial(int num) {
            if (num < 0) throw new IllegalArgumentException("Factorial undefined for negative numbers");
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            return factorial;
        }

        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public double divide(double a, double b) {
            if (b == 0) throw new IllegalArgumentException("Division by zero");
            return a / b;
        }

        public String checkDivision(double marks) {
            double total = marks / 600 * 100;
            if (total >= 90) return "1st";
            else if (total >= 80) return "2nd";
            else if (total >= 70) return "3rd";
            else if (total >= 60) return "4th";
            else if (total >= 50) return "5th";
            else return "failed";
        }

        public static void main(String[] args) {
            ReturnType obj = new ReturnType();

            System.out.println(obj.checkEvenOdd(77));
            System.out.println(obj.checkPrime(11));
            System.out.println(obj.factorial(5));
            System.out.println(obj.add(45, 21));
            System.out.println(obj.subtract(41, 21));
            System.out.println(obj.divide(50, 4));
            System.out.println(obj.checkDivision(450));
        }
    }

}
