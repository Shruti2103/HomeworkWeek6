package homeworkweek6;

public class Programe3 {
    static int p = 70;// static variable define
    int q = 80;// instance variable define

    public static void main(String[] args) {
        Programe3 programe3 = new Programe3();
        programe3.quiz1();
        quiz();


    }

    // create instance method
    public void quiz1() {
        Programe3 programe3 = new Programe3();// create new object for calling static varible
        System.out.println(programe3.p);// calling static variable output=70
        System.out.println(q);// calling q variable and printing

    }

    // create static method
    public static void quiz() {
        Programe3 quiz2 = new Programe3();// create object to call instance variable in to static method
        System.out.println(quiz2.q);// output-80
        System.out.println(p);// output-70


    }

}
