package loop;

public class InfiniteLoop {

    public static void main(String[] args) {

        /*for(int i=1; i>0; i++){

            System.out.println("Infinite for Loop.."+i);
        }*/

        int i=1;

       /* while(i>0){
            System.out.println("Infinite while  loop :"+i);
            i++;
        }*/

        do {
            System.out.println("Do while infinite loop..."+i);
            i++;
        } while (i>0);


    }
}
