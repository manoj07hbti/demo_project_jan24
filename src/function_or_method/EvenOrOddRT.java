package function_or_method;

public class EvenOrOddRT {
    // write a code to check even or odd Number

    public String checkEvenOdd(int number){
        if (number % 2 ==0){
            return "This is Even Number :"+number;

        }else{
            return "This is ODD Number :"+number;

        }
    }

    public static void main(String[] args) {
        EvenOrOddRT object = new EvenOrOddRT();
        String evenEvenOdd= object.checkEvenOdd(4);
        System.out.println(evenEvenOdd);
    }
}
