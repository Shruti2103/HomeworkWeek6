import java.util.Scanner;

public class Programe6 {
    public static void main(String[]args){

        double pi=3.14;// define variable
        int r;// define variable
        double area;// define variable

        Scanner sc = new Scanner(System.in);// new scanner object created for user to enter his value
        System.out.println("Enter the radius");//print statement
        r=sc.nextInt();//take radius value
        area =(pi*r*r);// formula to find out circle
       System.out.println("Area of circle is "+  area);
    }
}
