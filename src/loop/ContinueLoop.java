package loop;

public class ContinueLoop {
    public static void main(String[] args) {

        // TODO lot of programming language in IT sector

        //	HTML , Python , C ,Java ,C++ , Dotnet,, GoLang , Gherkin ,
        //	we need to print "backend Language" only in case of HTML print nothing.


        String language[] = {"HTML", "Python", "C", "JAVA", "C++", "DOTNET", "GoLang", "Gherkin"};

        for (int i = 1; i < language.length; i++) {

            if (language[i] == "HTML") {
                continue;
            }
            System.out.println("Printing backend language :" + language[i]);
        }
    }
}