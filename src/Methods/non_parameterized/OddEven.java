package Methods.non_parameterized;

public class OddEven {

    public void Odd (){
        System.out.println("===printing Odd number between 1 to 100====");
        for (int i = 2;i <=100 ; i = i+2){
            System.out.print(i+", ");
        }
    }
    public void even(){
        System.out.println("\n====printing even number between 1 to 100====");
        for (int i=1;i<=100;i = i+2){
            System.out.print(i+", ");
        }
    }
    public static void main(String[] args) {
        OddEven oddEven = new OddEven();
        oddEven.Odd();
        oddEven.even();
    }
}
