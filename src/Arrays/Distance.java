package Arrays;

public class Distance {
    public static void main(String[] args) {

        int [] Distance ={5 , 4, 6,8,9,20,23,43,45,56,67,87};

        System.out.println();
        System.out.println("=========================For Loop===============================");
        for (int i=0;i<Distance.length;i++){
            System.out.print(Distance[i]+" , ");
        }
        System.out.println();
        System.out.println("=========================Advance Loop===============================");
        for (int var:Distance){
            System.out.print(var+" , ");
        }
        System.out.println();
        System.out.println("=========================While Loop===============================");

        int i =0;
        while (i < Distance.length){
            System.out.print( " ," +Distance[i]);
            i++;
        }
        System.out.println();
        System.out.println("=========================Do  While Loop===============================");
        try {
            do {
                i++;
                System.out.println(" , "+Distance[i]);
                // i++;
            } while (i < Distance.length);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print(" *");
        }
    }
}
