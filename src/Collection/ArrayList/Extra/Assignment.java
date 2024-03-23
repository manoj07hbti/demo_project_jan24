package Collection.ArrayList.Extra;


import java.util.ArrayList;
import java.util.Scanner;

class Assignment {
    private ArrayList<String> CountryName() {
        ArrayList<String> country = new ArrayList<>();
        country.add("India");               //1
        country.add("Palestine");           //2
        country.add("Japan");              //3
        country.add("South Korea");          //4
        country.add("Singapore");           //5
        country.add("New ZeeLand");         //6
        country.add("United Arab Emirates");//7
        country.add("Qatar");               //8
        country.add("United States");         //9
        country.add("Germany");               //10
        country.add("United Kingdom");        //11
        country.add("France");                 //12
        country.add("Italy");                    //13
        country.add("Canada");                   //14
        return country;

    }

    private ArrayList<Double> Population() {
        ArrayList<Double> population = new ArrayList<Double>();
        population.add(1.3);               //1
        population.add(5.0);                  //2
        population.add(126.0);              //3
        population.add(51.0);              //4
        population.add(6.0);                //5
        population.add(5.0);                //6
        population.add(9.0);                //7
        population.add(3.0);                //8
        population.add(331.0);              //9
        population.add(83.0);               //10
        population.add(67.0);               //11
        population.add(65.0);               //12
        population.add(60.0);               //13
        population.add(38.0);               //14


        return population;
    }


    private ArrayList<Double> Salary() {
        ArrayList<Double> salary = new ArrayList<>();
        salary.add(350.56);        //1
        salary.add(20.0);        //2
        salary.add(4.5);          //3
        salary.add(45.6);          //4
        salary.add(8.9);         //5
        salary.add(32.6);         //6
        salary.add(9.0);         //7
        salary.add(23.8);         //8
        salary.add(11.1);         //9
        salary.add(7.9);          //10
        salary.add(98.4);          //11
        salary.add(55.0);          //12
        salary.add(11.6);          //13
        salary.add(90.0);          //14


        return salary;

    }
    private void getdata(int i){
        Assignment assignment =new Assignment();
        ArrayList k = assignment.CountryName();
        ArrayList d = assignment.Population();
        ArrayList s = assignment.Salary();
        System.out.println("Name           : "+k.get(i));
        System.out.println("Population     : "+d.get(i));
        System.out.println("Average salary : "+s.get(i));

    }

    public static void main(String[] args) {
        Assignment assignment = new Assignment();
        Scanner scanner = new Scanner(System.in);
        System.out.println("0.India");
        System.out.println("1.Palestine");
        System.out.println("2.Japan");
        System.out.println("3.South Korea");
        System.out.println("4.Singapore");
        System.out.println("5.New ZeeLand");
        System.out.println("6.United Arab Emirates");
        System.out.println("7.Qatar");
        System.out.println("8.United States");
        System.out.println("9.Germany");
        System.out.println("10.United Kingdom");
        System.out.println("11.France");
        System.out.println("12.Italy");
        System.out.println("13.Canada");
        System.out.println("--------------------------------\n");
        System.out.println("Enter country number : ");

        int n = scanner.nextInt();
        System.out.println("==========Country Details==========");
        switch (n) {
            case 0:
           assignment.getdata(n);
            break;
            case 1:
                assignment.getdata(n);
                break;
            case 2:
                assignment.getdata(n);
                break;
            case 3:
                assignment.getdata(n);
                break;
            case 4:
                assignment.getdata(n);
                break;
            case 5:
                assignment.getdata(n);
                break;
            case 6:
                assignment.getdata(n);
                break;
            case 7:
                assignment.getdata(n);
                break;
            case 8:
                assignment.getdata(n);
                break;
            case 9:
                assignment.getdata(n);
                break;
            case 10:
                assignment.getdata(n);
                break;
            case 11:
                assignment.getdata(n);
                break;
            case 12:
                assignment.getdata(n);
                break;
            case 13:
                assignment.getdata(n);
                break;

        }
    }
}