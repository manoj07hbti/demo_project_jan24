package my_function_and_method;

public class My_InPut_Param {
    public void checkprime(int number){
        boolean prime=true;
        for(int i=4; i<number; i++){
            if(number%2==0){
                prime=false;
            }
        }
        if(prime){
            System.out.println("number is prime:"+number);
        }else{
            System.out.println("number is not prime:"+number);
        }
    }
    public void factorial(int number){
        int factorial=1;

        for(int i=number; i>0; i--){
            factorial=factorial*i;

        }

        System.out.println("Factorial of given number is: "+factorial);
    }
    public void percentage(int a,int b){
       int result=a*100/b;
       System.out.println("percentage: "+result);
    }
    public void cube(int a ){
        int cube=a*a*a;
        System.out.println("cube of given number is :"+cube);
    }

    public static void main(String[] args) {
        My_InPut_Param obj=new My_InPut_Param();
        obj.checkprime(35);
        obj.factorial(4);
        obj.percentage(430,500);
        obj.cube(11);
    }
}
