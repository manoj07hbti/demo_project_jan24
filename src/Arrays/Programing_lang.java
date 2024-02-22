package Arrays;

public class Programing_lang {
    public static void main(String[] args) {


         String[] Languages={"Java" , "Python" , "C-lang" , "C++" , "Dotnet" , "HTML" , "GoLang" , "Gerkin" , "VB"};

         for (int i=1;i< Languages.length;i++){
             if (Languages[i] == "HTML"){
                 System.out.println("Front end "+Languages[i]);
                 continue;
             }
             System.out.println("Back end "+Languages[i]);
         }
    }
}
