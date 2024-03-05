package function_or_method;

public class EvenAndOdd {

    public void EvenOdd(){
        int a=5;
        if(a%2==0){
            System.out.println("number is even :"+a);
        }else{
            System.out.println("number is odd :"+a);
        }
    }

    public static void main(String[] args) {
        EvenAndOdd obj=new EvenAndOdd();
        obj.EvenOdd();
    }
}
