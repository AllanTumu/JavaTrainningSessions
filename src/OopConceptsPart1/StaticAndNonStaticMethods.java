package OopConceptsPart1;

public class StaticAndNonStaticMethods {

    //global variable can be accessed all over the place
    String name = "Tom"; //Non static global variable
    static int age = 25; //Static global variable

    public static void main (String[] args) {
        //how to call static methods
        //1. Call static methods directly
        sum();
        //.2 You can use the Class name
        StaticAndNonStaticMethods.sum();

        //How to call static variables
        //1. Call them directly
        System.out.println(age);
        //2. Call them using the class name
        System.out.println(StaticAndNonStaticMethods.age);


        //Calling Non static variables
        StaticAndNonStaticMethods obj = new StaticAndNonStaticMethods();
        String x = obj.name;
        System.out.println(x);

        //Calling Non Static Variables
        obj.sendMail();

    }

    public void sendMail() {
        System.out.println("Send mail method");
    }

    public static void sum() {
        System.out.println("Sum method");
    }
}
