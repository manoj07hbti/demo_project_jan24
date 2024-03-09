package function_or_method;

import java.io.FilterOutputStream;

public class CalculatorApplication {
    //we are addition
    public void addition(){
        int a=3;
        int b=7;
    }
    public void addition(int a,int b){
        int result = a+b;
        System.out.println("We are adding A+B:"+result);
    }
    // we are subtraction
    public void sub(){
        int a=9;
        int b=4;
    }public void sub(int a, int b){
        System.out.println("We are subtraction A-B :"+toString());
    }
    //We are division
    public void divide(){
        int a=16;
        int b=2;
    }
    public void divide(int a, int b){
        int result =a/b;
        System.out.println("We are division A/B:"+result);
    }
    //We are multiply
    public void multiply(){
        int a=2;
        int b=9;
    }
    public void multiply(int a, int b){
        int result =a*b;
        System.out.println("We are Multiply A*B :"+result);
    }



    // cube
    public void cube(){
        int a=5;

    }public void cube(int a){
        int cube = a*a*a;
        System.out.println("We are Creating cube of A:"+cube);

    }



    //We are creating percentage
    public void per(int a, int b){
        double per =(double)a*b/100;  //number*percentage/100
        System.out.println("We are creating percentage :"+per);
    }

    public static void main(String[] args) {
        CalculatorApplication object = new CalculatorApplication();
        object.addition();
        object.sub();
        object.divide();
        object.multiply();
        object.cube();


    }








}
