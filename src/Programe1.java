public class Programe1 {
    int a = 30;// create instance variable inside class
    int b = 60;// create instance variable inside class

    public static void main(String[] args) {
        Programe1 programe1 = new Programe1();// create new object to call instance variable
        System.out.println(programe1.a);// output=30

        Programe1 programme2 = new Programe1();// create new  object to call instance variable
        System.out.println(programme2.b);// output=60

    }

    // Create new instance method
    public void test() {
        System.out.println(a);// printing out instance variable in instance method- output -30
        System.out.println(b);// printing out instance variable in instance method -output-60

    }
}

