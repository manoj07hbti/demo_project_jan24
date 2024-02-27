package Arrays;

public class Height {
    public static void main(String[] args) {

        double [] Height= {34.4,34,6.64,64.2,76.9,78,78,23};

        System.out.println();
        System.out.println("=========================While Loop===============================");

        for (int i=0;i< Height.length;i++){
            System.out.print(Height[i]+" , ");
        }
        System.out.println();
        System.out.println("==================================================");

        System.out.println("Printing arrayList using var loop");
        for (double var:Height){
            System.out.print(var+" , ");
        }

        System.out.println();
        System.out.println("=========================While Loop===============================");

        int i =0;
        while (i < Height.length){
            System.out.print(Height[i]+" ," );
            i++;
        }
        System.out.println();
        System.out.println("=========================Do  While Loop===============================");
        try {
            do {
                i++;
                System.out.println(Height[i]+ " ,");
                // i++;
            } while (i < Height.length);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print(" *");
        }
    }
}
