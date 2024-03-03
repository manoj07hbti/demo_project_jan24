package Methods;

public class Student {
int marks =60;
    public void student_division(){

        if (marks>=75){
            System.out.println("First division");
        } else if (marks>=59.59 && marks<=74) {
            System.out.println("Second division");
        }else if (marks>=33 && marks<=59){
            System.out.println("third division");
        }else {
            System.out.println("fail");
        }
    }

    public static void main(String[] args) {
        Student student =new Student();
        student.student_division();
    }
}
