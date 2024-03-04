package function_or_method;

public class FindEvenAndOdd {
    // todo write a code find even and odd number between 1 to 100

    public void EvenAndOdd(){

        for (int a=2; a<=100;a=a+2){
            System.out.println("Printing Even Number : "+a);

        }
        for (int a=1; a<100; a=a+2){
            System.out.println("Printing Odd Number :"+a);



        }


    }
            // to run even and odd no. via function method
    public static void main(String[] args) {
        FindEvenAndOdd object =new FindEvenAndOdd();
        object.EvenAndOdd();
    }

}
