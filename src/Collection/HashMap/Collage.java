package Collection.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Collage {
    public static void main(String[] args) {
        Collage collage=new Collage();
        collage.Student();
    }
    private void Student() {
        //Agra students details
        st student1 = new st("Sri Kumar", 1, "Mechanical Engineering", 120000);
        st student2 = new st("Kumar Datta", 2, "Communication Engineering", 120000);
        st student3 = new st("Divendra", 3, "Aeronautical Engineering", 120000);
        st student4 = new st("Arjun Kumar", 4, "B-Com", 80000);
        st student5 = new st("Raja Singh", 5, "Electronics Engineering", 220000);
        st student6 = new st("Mani Kanta", 6, "Mechanical Engineering", 120000);
        //Dps Students details
        st student7 = new st("Bakhtawar Hassan", 7, "Electrical Engineering", 680000);
        st student8 = new st("Fayaj Ahmad", 8, "Electrical Engineering", 680000);
        st student9 = new st("Siva Munda", 9, "Mechanical Engineering", 680000);
        st student10 = new st("Arjun Mardi", 10, "Electrical Engineering", 680000);
        st student11 = new st("Sarfraz Khan", 11, "Mechanical Engineering", 600000);
        st student12 = new st("Vishal Kumar", 12, "Mechanical Engineering", 650000);
        st student13 = new st("Vikash Jha", 13, "Mechanical Engineering", 660000);
        st student14 = new st("Abuzer Bandawi", 14, "Mechanical Engineering", 650000);
        //JNU students details
        st student15 = new st("Idd Mohammad", 15, "Mechanical Engineering", 25000);
        st student16 = new st("Faisal Sulemani", 16, "Mechanical Engineering", 15000);
        st student17 = new st("Waqar Ahmad", 17, "Mechanical Engineering", 15000);
        st student18 = new st("Akhalad khan", 18, "Mechanical Engineering", 15000);
        st student19 = new st("Imran Nazir", 19, "Electrical Engineering", 15000);
        st student20 = new st("Rizwan", 20, "Mechanical Engineering", 16000);
        st student21 = new st("Sunoth Kumar", 21, "Mechanical Engineering", 16000);
        st student22 = new st("Sai Kiran", 22, "Mechanical Engineering", 5000);

        HashMap<String, ArrayList<st>>listHashMap=new HashMap<>();
        ArrayList<st> AGRAstudents=new ArrayList<>();
        AGRAstudents.add(student1);
        AGRAstudents.add(student2);
        AGRAstudents.add(student3);
        AGRAstudents.add(student4);
        AGRAstudents.add(student5);
        AGRAstudents.add(student18);
        AGRAstudents.add(student13);
        AGRAstudents.add(student14);

        ArrayList<st> DPSstudents=new ArrayList<>();
        DPSstudents.add(student6);
        DPSstudents.add(student7);
        DPSstudents.add(student8);
        DPSstudents.add(student9);
        DPSstudents.add(student10);
        DPSstudents.add(student11);
        DPSstudents.add(student12);
        DPSstudents.add(student13);
        DPSstudents.add(student14);


        ArrayList<st> JNUstudents=new ArrayList<>();
        JNUstudents.add(student15);
        JNUstudents.add(student16);
        JNUstudents.add(student17);
        JNUstudents.add(student18);
        JNUstudents.add(student19);
        JNUstudents.add(student20);
        JNUstudents.add(student21);
        JNUstudents.add(student22);

        listHashMap.put("JNU",JNUstudents);
        listHashMap.put("DPS",DPSstudents);
        listHashMap.put("AGRA",AGRAstudents);

        Scanner scanner =new Scanner(System.in);
        System.out.println("Agra University");
        System.out.println("JNU University");
        System.out.println("DPS University");
        System.out.println("Enter University Name which you want to print");
        String university=scanner.next();
        for (String s:listHashMap.keySet()){
            if (s.equalsIgnoreCase(university)) {
                for (st student : listHashMap.get(s)) {
                    System.out.println("===========================");
                    System.out.println(" Id : "+student.getId()+"\n Name : " + student.getName() + "\n Fees : " + student.getFees()+
                                         "\n Course : "+student.getCourse());
                }
            }
        }
        System.out.println("===============================");
    }
}
class st{
    String name ;
    int id;
    String course;
    double fees;

    public st(String name, int id, String course, double fees) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

}