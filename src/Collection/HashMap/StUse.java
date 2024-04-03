package Collection.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class StUse {
    private void student(){
        HashMap<String ,ArrayList<Student>>studentHashMap=new HashMap<>();
        Student student1=new Student("Idd",1,"SC");
        Student student2=new Student("Raju",2,"SC");
        Student student3=new Student("Nil",3,"SC");
        Student student4=new Student("Kumar",4,"SC");
        Student student5=new Student("kais",5,"SC");
        Student student6=new Student("Rahul",6,"SC");

        ArrayList<Student>SectionA=new ArrayList<>();
                    SectionA.add(student1);
                    SectionA.add(student2);
                    SectionA.add(student3);
        ArrayList<Student>SectionB=new ArrayList<>();
                    SectionB.add(student4);
                    SectionB.add(student5);
                    SectionB.add(student6);

        studentHashMap.put("A",SectionA);
        studentHashMap.put("B",SectionB);

         for (String va:studentHashMap.keySet()){
                // System.out.println(studentHashMap.get(va));
              for (Student student:studentHashMap.get(va)){
                  System.out.println("--------------------------");
                  System.out.println("Name : "+student.getName()+"\n Id : "+student.getId()+" \n Dept : "+student.getDept());
              }
         }
        
    }

    public static void main(String[] args) {
        StUse stUse =new StUse();
        stUse.student();
    }
}
