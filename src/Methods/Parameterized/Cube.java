package Methods.Parameterized;

public class Cube {

    public void cube(int size){
        int TSA = 6*(size*size);
        int LSA=4*size*size;

        System.out.println("Total surface area of cube is "+TSA);
        System.out.println("Lateral surface area of cube is "+LSA);
    }
    public static void main(String[] args) {

     Cube cube =new Cube();
     cube.cube(4);
    }
}
