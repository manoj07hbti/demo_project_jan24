package Arrays;

public class Month_Break {
    public static void main(String[] args) {

        int[] Months ={1,2,3,4,5,6,7,8,9,10,11,12,13};
           int j =13;
        for (int i=1;i< Months.length;i++){
            if (j == Months[i]){
                break;
            }
            System.out.println(Months[i]);
        }
    }
}
