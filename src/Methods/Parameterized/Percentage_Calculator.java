package Methods.Parameterized;

public class Percentage_Calculator {

    public void Percentage(int num ,int num1){
        double p =  (double) 100  *num/ num1;
        System.out.println(p);
    }

    public static void main(String[] args) {
        Percentage_Calculator percentageCalculator=new Percentage_Calculator();
        percentageCalculator.Percentage(24,1000);
    }
}
