package my_loop;

public class DoWhileLoop {
    public static void main(String[] args) {
        //  find even number between 100 to 200 Using Do While Loop

        int i = 100;
        do {
            if (i % 2 == 0)
                System.out.println("Printing even number" + i);
            i++;
        } while (i <= 200);


    }
}
