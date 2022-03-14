package homeworkweek6;

import java.util.Scanner;

public class Programe13 {
      public static void main(String[]args){
          int w;
          int x;
          int y;
          int avg;

          Scanner calculate1=new Scanner( System.in);// make allow user to enter one number
          System.out.println("Enter first value");
          w=calculate1.nextInt();// system taking user number

          Scanner calculate2=new Scanner( System.in);
          System.out.println("Enter second value by user");
          x= calculate2.nextInt();// system taking second user number

          Scanner calculate3=new Scanner(System.in);// make user to enter 3rd number
          System.out.println("Enter 3rd digit");
          y=calculate3.nextInt();// system is taking 3rd user number

          avg=(w+x+y)/3;
          System.out.println("The average for 3 numbers are" + avg);







      }


}
