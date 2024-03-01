package Methods;

public class Doctor {

   public static void doctor (){
       int Id =7;
       String name = "Sayed";
       double height =5.9;
       String Specialist = "Surgeon";
       String Branch ="Cardiologists";

       System.out.println("\n=====Doctor Details=====");
       System.out.println("Name        : "+name+"\nID No.      : "+Id+"\nHeight      : "+height+"\nSpecialist  : "+
               Specialist+"\nBranch      : "+ Branch);

   }

    public static void main(String[] args) {
        doctor();
    }
}
