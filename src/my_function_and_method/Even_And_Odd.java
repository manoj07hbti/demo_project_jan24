package my_function_and_method;

public class Even_And_Odd {
    public void even_and_odd(){
        int number = 100;
        System.out.print("List of even and odd numbers from 1 to " + number + " ");
        for (int i = 1; i <= number; i++) {
       //logic to check if the number is even or not
       //if i%2 is equal to zero, the number is even
            if (i % 2 == 0) {
                System.out.print( "even number " +i + " , ");
            }else{
                System.out.println("odd number"+i);
            }
        }
    }


    public static void main(String[] args) {
        Even_And_Odd obj=new Even_And_Odd();
        obj.even_and_odd();

    }
}
