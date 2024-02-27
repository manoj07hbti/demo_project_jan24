package loop;

public class ForLoopEvenNumber {
    public static void main(String[] args) {




        // TODO write a code to find even number between 100 to 200 Using For Loop
        int number=2;
        for(int i=100; i<=200; i=i+2){
            System.out.println("printing even number:"+i);
        }










        // TODO write a code for factorial : 5 (5*4*3*2*1)

        int numbers = 5;
        int factorial = 1;

        for (int a = 1; a <=5; a++) {
            factorial = factorial * a;

        }
        System.out.println("Factorial of " + numbers + " is: " + factorial);













        // TODO write a code for factorial : 3 (3*2*1)

        int numb = 3;
        int fact = 1;

        for (int a = 1; a <=3; a++) {
            fact = fact * a;
        }
        System.out.println("Factorial of " + numb + " is: " + fact);
    }

}
