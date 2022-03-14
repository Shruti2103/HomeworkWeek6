package homeworkweek6;

public class Programe16 {
    public static void main(String[] args) {
        String in1 ="10";// variable define
        String in2="11";

        int number0= Integer.parseInt(in1,2);//
        int number1= Integer.parseInt(in2,2);

        int addition=number0+ number1;// add 2 integer in addition

        System.out.println(Integer.toBinaryString(addition));// printing  addition in binary

    }

}
