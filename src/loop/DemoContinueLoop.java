package loop;

public class DemoContinueLoop {

    public static void main(String[] args) {

        // TODO we have lot of programming language
        //	Java , Python , C , C++ , Dotnet,HTML, GoLang , Gerkin , VB
        //	we need to print "Language is backend Language" only in case of HTML print nothing.

        String language[] = {"Java" , "Python" , "C" , "++" , "Dotnet","HTML", "GoLang" , "Gerkin" , "VB"};

        for (int i = 1; i < language.length; i++) {

            if (language[i] == "HTML") {

                continue;
            }
            System.out.println("Printing Language is backend language :" + language[i]);
        }


    }



}
