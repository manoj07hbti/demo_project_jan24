package function_or_method;

public class PrimeNumber {

    public void checkPrime(){
        int num=4;
        boolean IsPrime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                IsPrime=false;
            }
        }
        if(IsPrime){
            System.out.println("number is prime :"+num);
        }else{
            System.out.println("number is not prime :"+num);
        }
    }

    public static void main(String[] args) {
        PrimeNumber obj=new PrimeNumber();
        obj.checkPrime();
    }

}
