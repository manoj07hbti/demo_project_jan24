package exception;

public class DemoException {

   public void divide(int a, int b){
       System.out.println("Before Division....");
       int result=0;
       try {
            result = a / b;
       }
       catch (Exception e){
           System.out.println("Exception occurred ...."+e);
       }
       finally {
           System.out.println("I am finally block AND get executed everytime...");
       }
       System.out.println("After Division....");
       System.out.println("Division is : "+result);
   }


    public static void main(String[] args) {
        DemoException obj= new DemoException();
        obj.divide(4,2);
        obj.divide(0,2);
        obj.divide(4,0);

    }

}
