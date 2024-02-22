package Loop;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Continue {
    public static void main(String[] args) {
        /*we have lot of programming language
        Java , Python , C , C++ , Dotnet,HTML, GoLang , Gerkin , VB
         we need to print "Langauage is backend Language" only in case of HTML print nothing.*/



        String[] lang={"java","python","c","c++","dotnet","HTML","golang","gerkin","vb"};

        for (int i=1; i< lang.length; i++){
            if (lang[i].equals("HTML"))
            {continue;}

                System.out.println(lang[i]);
        }


    }
}
