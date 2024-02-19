package my_loop;

import javafx.scene.control.TableColumn;

import java.sql.SQLOutput;

public class Even_And_Odd {
    public static void main(String[] args) {
        //list off even number
        int number=100;
        for(int i=1; i<=100; i++){

            System.out.println("List off even number:  ");
            if(i%2==0)

                System.out.println(i++);
        }
        //list of Odd number
        int number2=100;
        for(int i=1; i<=100; i++){

                if(!(i%2==0))
                    System.out.println(i++);
            System.out.println("List off Odd number:  " );
        }

    }

}
