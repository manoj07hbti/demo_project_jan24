package function_or_method;

public class CalCWithReturnType {

    public int addition(int a, int b) {

        int result = a + b;
        return result;
    }
// sub, multi , divide
    public static void main(String[] args) {

        CalCWithReturnType obj = new CalCWithReturnType();
        int add = obj.addition(23, 53);
        System.out.println("Addition is: " + add);
        add = obj.addition(12, 121);
        System.out.println("Addition is: " + add);
    }

}
