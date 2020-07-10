package OopConceptsPart1;

public class ObjectsInJava {
    int age;
    int height;

    public static void main (String[] args){

        //Create 3 objects of class Allan
        // new Allan(); -- This is the object of class Allan
        // new Key word is used to create the object
        //a,b and c are called object reference variable

        ObjectsInJava a = new ObjectsInJava();
        ObjectsInJava b = new ObjectsInJava();
        ObjectsInJava c = new ObjectsInJava();

        //Assigning values to each object
        a.age = 20;
        a.height = 5;

        b.age = 25;
        b.height = 6;

        c.age = 18;
        c.height = 4;

        System.out.println(a.age);
        System.out.print(b.height);



    }
}
