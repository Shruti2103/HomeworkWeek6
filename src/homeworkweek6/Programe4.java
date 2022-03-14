package homeworkweek6;

public class Programe4 {

    static int salary = 10000;// create static variable
    static String name = "Shruti";// create static variable
    int v = 5000;// create instance variable
    String surname = "Devani";// create instance variable

    // main method
    public static void main(String[] args) {
        Programe4 resume1 = new Programe4();
        resume1.earning();
        expense();


    }

    // create instance method
    public void earning() {
        System.out.println(v);// calling instance variable in instance method
        System.out.println(surname);// calling instance variable in instance method
        Programe4 programe6 = new Programe4();// create new object to call static variable in to instance method
        System.out.println(programe6.salary);// output-10000
        Programe4 programe7 = new Programe4();// create new object to call static variable in to instance method
        System.out.println(programe7.name);// output-Shruti

    }

    // create static method
    public static void expense() {
        System.out.println(salary);// call static variable output-10000
        System.out.println(name);// call name variable output-Shruti
        Programe4 programe4 = new Programe4();// object create for callinf instance variable to static method
        System.out.println(programe4.v);// output-5000
        Programe4 programe5 = new Programe4();// create object to call instance variable to static method
        System.out.println(programe5.surname);

    }

}
