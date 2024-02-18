package loop;

public class WhileLoopEvenNumber {

    public static void main(String[] args) {

        // TODO write a code to find even number between 100 to 200 Using While Loop

        int i = 100;
        while (i <= 200) {
            if (i % 2 == 0)
                System.out.println("printing even number"+i);
            i++;
        }

        // TODO write a code for factorial : 5 (5*4*3*2*1) using WhileLoop

        int a = 5;
        int b = 1;
        int c = 1;
        while (c <= a) {
            b = b * c;
            c++;

        }
        System.out.println("Printing Factorial:"+b);

        // TODO write a code for factorial : 3 (3*2*1) using WhileLoop

        int d = 3;
        int e = 1;
        int f = 1;
        while (f <= d) {
            e = e * f;
            f++;

        }
        System.out.println("Printing Factorial:"+e);


    }
        }

