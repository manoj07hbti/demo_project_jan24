package ConditionalStatements;

public class Switch {
    public static void main(String[] args) {
        //todo Month 1 : January , 2 Feb 3 ....12
        int month = 1;
        switch (month) {
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;

            default:
                System.out.println("Invalid");
        }

    }
}

