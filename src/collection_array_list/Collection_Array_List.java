package collection_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection_Array_List {

    // TODO take input from user and add to your list, ask user to continue or exit
// create a String arrayList
    public ArrayList<String> StringArrayList(){
        //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList<String> studentName= new ArrayList<>();
        studentName.add("Rajeev");
        studentName.add("Nitin");
        studentName.add("Anoop");
        studentName.add("Dhiraj");
        studentName.add("Amit");

        return studentName;

    }

    // TODO String list : CountryName
    public ArrayList<String> countryName(){
        ArrayList<String> countryName = new ArrayList<>();
        countryName.add("India");
        countryName.add("Australia");
        countryName.add("America");
        countryName.add("Canada");
        countryName.add("SouthAfrica");

        return countryName;

    }

    // TODO Country Population : Long
    public ArrayList<Integer> CountryPopulation(){
    ArrayList<Integer> CountryPopulation = new ArrayList<>();
        CountryPopulation.add(987654443);// India
        CountryPopulation.add(853453039);// Pakistan
        CountryPopulation.add(253842020);// Australia
        CountryPopulation.add(983745935);// America
        CountryPopulation.add(953746234);// South Africa

        return CountryPopulation;

    }


    // create a String arrayList

    public ArrayList<Integer> IntList(){
        ArrayList<Integer> marks =new ArrayList<>();
        marks.add(33);
        marks.add(42);
        marks.add(94);
        marks.add(44);
        marks.add(87);

        return marks;
    }

    //TODO create double Arraylist
    public ArrayList<Double> doubleList(){

        ArrayList<Double> salary = new ArrayList<>();

        salary.add(53446.35);
        salary.add(87665.65);
        salary.add(67888.35);

        return salary;

    }

    public static void main(String[] args) {
    Collection_Array_List obj = new Collection_Array_List();
    ArrayList<String> studentName = obj.StringArrayList();

        //TODO find out the name which starts with Letter A

    for(String var : studentName){
        if (var.startsWith("A"))
        System.out.println("Printing name:"+var);
    }

    ArrayList<String> countryName = obj.countryName();

    for(String var : countryName){
        System.out.println("Printing Country Name :"+var);
    }
    ArrayList<Integer>CountryPopulation= obj.CountryPopulation();

    for (Integer var : CountryPopulation){
        System.out.println("Printing CountryPopulation:"+var);
    }

    ArrayList<Integer>marks=obj.IntList();
        //TODO find out all the marks between 33 to 44

    for(Integer var : marks){
        if(var>=33 && var<=44)
            System.out.println("Printing Marks:"+var);
    }
        ArrayList<Double> salary = obj.doubleList();
    for(Double var : salary){
        System.out.println("Printing Salary:"+var);

    }

    }

}
