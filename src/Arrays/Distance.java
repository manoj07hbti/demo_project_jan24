package Arrays;

public class Distance {
    public static void main(String[] args) {

        int [] Destance ={5 , 4, 6,8,9,20,23,43,45,56,67,87};

        System.out.println("Printing arrayList using for loop");
        for (int i=0;i<Destance.length;i++){
            System.out.print(Destance[i]+" , ");
        }
        System.out.println();
        System.out.println("==================================================");
        System.out.println("Printing arrayList using var loop");
        for (int var:Destance){
            System.out.print(var+" , ");
        }
    }
}
