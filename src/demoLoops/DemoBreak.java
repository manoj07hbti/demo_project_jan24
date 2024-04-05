package demoLoops;

public class DemoBreak {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,};
       int num=13;
        System.out.println("");
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                System.out.println("loop breks here :"+i);
                break;
            }
        }

    }

}
