package loop;

public class DoWhileLoopEvenNumber {
    public static void main(String[] args) {

        // TODO write a code to find even number between 100 to 200 Using Do While Loop

        int i = 100;
        do {
            if (i % 2 == 0)
                System.out.println("Printing even number" + i);
            i++;
        } while (i <= 200);

        // TODO write a code for factorial : 5 (5*4*3*2*1)


        int num=5;
        int num2=1;
        int num3=1;
        do{
            num2=num2*num3;
            System.out.println(num2);
            num3++;
        }while(num3<=num);


        // TODO write a code for factorial : 3 (3*2*1)

        int num1=3;
        int num4=1;
        int num5=1;
        do{
            num4=num4*num5;
            System.out.println(num4);
            num5++;
        }while(num5<=num1);
    }
}
