package my_loop;

public class Continue {
    public static void main(String[] args) {

        String language[] = {"Java", "Python", "C", "C++", "Dotnet", "HTML", "Gherkin", "Golang", "VB"};
        for (String var : language) {

            if (var.equals("HTML")) {
                continue;
            }
            System.out.println("Language is backend language:- " + var);
        }
    }
}
