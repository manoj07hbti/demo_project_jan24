package function_or_method;

public class Cube {

    public void makeCube(){
        int num=4;
        int cube=num*num*num;
        System.out.println("Cube of given number is :"+cube);
    }

    public static void main(String[] args) {
        Cube obj=new Cube();
        obj.makeCube();
    }

}
