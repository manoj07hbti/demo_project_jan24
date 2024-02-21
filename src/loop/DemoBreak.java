package loop;

public class DemoBreak {

    public static void main(String[] args) {

        for (int i=1; i<10; i++){

            System.out.println("inside for loop :" +i);
            if(i==7){

                System.out.println("Exit from Loop");
                break;
            }
        }


     int arr[]={3,4,6,2,5,8,10};
     int number=2;
     for(int i=0; i<arr.length; i++){

         if(number==arr[i]){

             System.out.println("Give number found at position :"+i);
             break;
         }

     }

    }
}
