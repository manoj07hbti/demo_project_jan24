package conductional_statement;public class DemoOROperator2 {
    public static void main(String[] args) {

        // TODO Write a code for Laptop brand based on brand name and hardware RAM configuration we need show goog quality or poor quality

        String Brand = "DELL";
        int ram = 8;
        if (ram >= 8 || Brand == "DELL") {
            System.out.println("Brand Name DELL Is Good Quality With 8GB RAM");
        } else {
            System.out.println("Brand Name DELL Is POOR Quality With 8GB RAM");
        }
    }
}