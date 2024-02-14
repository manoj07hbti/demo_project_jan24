package ConditionalStatements;

public class Variable_manupulation {
    public static void main(String[] args) {
        int a=7;
        int b=9;

        int add =a*b;
        System.out.println(add);

        double divide =(double) a/b;
        System.out.println(divide);

        int square = a*a;
        System.out.println(square);

        int cube = a*a*a;
        System.out.println(cube);

        String name = "raj";
        int age = 50;
        double salary = 50000;
        String father = "raju";

        System.out.println("printing all variables   ," + "\n" +"name  :"+name + "\n" +"  age  ;"+ age +"\n" +"  salary:  " + salary +"\n" +"  father name:  " + father +"\n" + a +"\n" + b+
                "\n" +  add + "\n" +divide + "\n" +square +"\n" + cube);







    }
}
