package homeworkweek6;

import java.util.Locale;
import java.util.Scanner;

public class Programe19 {

    public static void main(String[] args) {
        String alp;// define string variable
        String alp1;

        Scanner abc = new Scanner(System.in);// allow user to input below line
        System.out.println(" THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG. ");//
        alp=abc.nextLine();
        System.out.println( alp.toLowerCase(Locale.ROOT));//output is in lower case
    }

}
