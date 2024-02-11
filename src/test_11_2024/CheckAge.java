package test_11_2024;

public class CheckAge {

    public static void main(String[] args) {

        //TODO Write a code to check Age group
        //  1. age >0 and <18  : Child
        //  2. age >=18  and <=40 : Young
        //  3. age >=60 : Old Age
        //1. age >0 and <18  : Child
        int a=16;
        if(a>0 && a<=18){
            System.out.println("age is child age");
        }
        //  2. age >=18  and <=40 : Young
        int b=25;
        if(b>=18 && b<=40){
            System.out.println("age is young age");
        }
        //  3. age >=60 : Old Age
        int c=70;
        if(c>=60){
            System.out.println("age is old age");
        }



    }


}
