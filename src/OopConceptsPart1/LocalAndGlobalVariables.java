package OopConceptsPart1;

public class LocalAndGlobalVariables {

    //Global variables
    String name = "Allan";
    int age = 22;


    public static void main (String[] args) {

        //Local Variable
        int i = 23;
        System.out.println(i);

        //To access global Variable, We need to create an Object
        LocalAndGlobalVariables obj = new LocalAndGlobalVariables();

        System.out.println("The Age of " +obj.name + " is " +obj.add());

    }

    public int add() {

        //Local Variables
        int i = 10;
        int b = 20;
        int sum = i+b;

        return sum;
    }
}
