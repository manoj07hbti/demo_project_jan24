package third_Test;

public class SquareOneToTen {


    // Square b/w 1 t0 10

    public void square() {

        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            System.out.println(square);
        }
    }
    public static void main(String[] args) {
         SquareOneToTen squre= new SquareOneToTen();
        squre.square();

}

}