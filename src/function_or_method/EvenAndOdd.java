package function_or_method;

public class EvenAndOdd {

    // Todo write a code to find even and odd number between 1 to 100
    public void evenandodd(){

    for(int i=2 ; i<=100; i=i+2){
            System.out.println("Printing Even Number:"+i);
        }
        for(int i=1 ; i<100; i=i+2){
            System.out.println("Printing Odd Number:"+i);
        }

    }
    public static void main(String[] args) {

        EvenAndOdd obj=new EvenAndOdd();
        obj.evenandodd();
    }

}
