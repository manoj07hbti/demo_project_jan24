package Arrays;

public class Height {
    public static void main(String[] args) {

        double [] Height= {34.4,34,6.64,64.2,76.9,78,78,23};

        System.out.println("Printing arrayList using for loop");
        for (int i=0;i< Height.length;i++){
            System.out.print(Height[i]+" , ");
        }
        System.out.println();
        System.out.println("==================================================");
        System.out.println("Printing arrayList using var loop");
        for (double var:Height){
            System.out.print(var+" , ");
        }

    }
}
