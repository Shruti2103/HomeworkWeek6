package homeworkweek6;

import java.util.Scanner;

public class Programme8 {

    public static void main(String[]args){

        double base;
        double height;
        double a;

        Scanner sc=new Scanner(System.in);//
        System.out.println("Enter the base value");
        base =sc.nextDouble();

        Scanner ca =new Scanner(System.in);
        System.out.println("Enter height value");
        height=ca.nextDouble();

        a=(base*height)/2;

        System.out.println("Area of Triangle is "+ a);


    }
}
