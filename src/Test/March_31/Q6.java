package Test.March_31;

public class Q6 {
   // write a code to print cube of number starting from 1 to 10

    public void cube (){

        for (long i = 1L; i <= 10L; i++){
            long cube=i*i*i;
            System.out.println(cube);
        }

    }

    public static void main(String[] args) {
        Q6 obj = new Q6();
        obj.cube();
    }
}
