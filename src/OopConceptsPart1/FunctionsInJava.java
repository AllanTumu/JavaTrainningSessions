package OopConceptsPart1;

public class FunctionsInJava {

    public static void main (String[] args) {

        FunctionsInJava obj = new FunctionsInJava();
        //One object will be created , obj is the reference variable, referring to the object
        //After creating the object, the copy of all non static methods will be given to this object

        obj.tests();
        int value = obj.car();
        System.out.println("The new value is:" +value);
        //String atm = obj.qa();
        System.out.println(obj.qa());
        System.out.println(obj.div(20,10));


    }

    //void means it does not return any thing
    public void tests() { //no input no output
        System.out.println("Test Method");
    }

    public int car() { //no input some output
        System.out.println("Car Method");

        int a = 10;
        int b = 20;
        int c = a+b;

        return c;
    }

    public String qa() { //no input Some output
        System.out.println("QA Method");
        String s = "Appium";
        return s;
    }

    public int div (int x, int y) { //Has input and has output

        System.out.println("Div Method");
        int d = x/y;
        return d;
    }

}
