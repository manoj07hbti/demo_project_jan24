package class_and_object;

public class Doctor1 {
    String Name;
    String Specialist;
    String Location;
    int mobile;
    double Experience;

    public Doctor1(String name, String specialist, String location, int mobile, double experience) {
        Name = name;
        Specialist = specialist;
        Location = location;
        this.mobile = mobile;
        Experience = experience;
    }

    public static void main(String[] args) {

        Doctor1 doctor2 = new Doctor1("Manish", "Dentist", "Agra", 987654328, 5);

        System.out.println("Printing Doctor Name :" + doctor2.Name + " specialist:" + doctor2.Specialist + " location:" + doctor2.Location + " mobile:" + doctor2.mobile + " experience:" + doctor2.Experience);


    }


}
