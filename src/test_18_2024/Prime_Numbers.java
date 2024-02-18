package test_18_2024;

public class Prime_Numbers {

    public static void main(String[] args) {

        // TODO write a program to check prime numbers between 1 to 20

        int i =0;
        int num =0;
        String  primeNumbers = "";

        for (i = 1; i <= 20; i++)
        {
            int a=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    a = a + 1;
                }
            }
            if (a ==2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 20 are :");
        System.out.println(primeNumbers);



            }
        }