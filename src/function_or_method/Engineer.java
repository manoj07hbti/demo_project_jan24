package function_or_method;

import class_and_object.Engineer1;

public class Engineer {
    String Name;
    String Branch;
    int mobile;

    // Design
    // Run
    // Ideas

    public void Design(){
        System.out.println("This Is Design Methods");
    }
    public void Run(){
        System.out.println("This Is Run Methods");
    }
    public void Ideas(){
        System.out.println("This Is Ideas Methods");
    }

    public static void main(String[] args) {

        Engineer engineer = new Engineer();
        engineer.Design();
        engineer.Run();
        engineer.Ideas();

    }


}
