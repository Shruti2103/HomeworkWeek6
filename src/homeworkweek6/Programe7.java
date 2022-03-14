package homeworkweek6;

import java.util.Scanner;// scanner is class used to scan the input data

public class Programe7 {

    public static void main(String[]args){

        float fah,cel;// define 2 variables fah and cel

        Scanner sc=new Scanner(System.in);// making user to enter any value

        System.out.println("Enter the temperature  to convert  in to Celsius");
        fah=sc.nextFloat();//take fahrenheit value
        cel=((fah-32)*5/9);// formula to convert fahrenheit to Delicious
        System.out.println("Temperature in Celsius "+  cel);// temperature in celsius plus showing its value


    }
}
