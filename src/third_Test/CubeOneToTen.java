package third_Test;

import java.util.Scanner;

public class CubeOneToTen {


        public static void main(String[] args)

        {
            int i=1,n=10;

            System.out.print("Input number : ");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            for(i=1;i<=10;i++)
            {
                System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));
            }
        }
    }



