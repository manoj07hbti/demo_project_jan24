package Methods.With_return;

public class OddEven {

    public String checkOddEven(int Num){
        if (Num %2 ==0){
           return "given number is even number";
        }else {
           return "given number is odd number";
        }
    }

    public static void main(String[] args) {
        OddEven oddEven=new OddEven();
       String output= oddEven.checkOddEven(8);
        System.out.println(output);
    }
}
