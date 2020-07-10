package OopConceptsPart2;

public class TestCar {

    public static void main(String[] args) {

        //This is called, static polymorphism or compile polymorphism

        //Method over riding is where the same method is present in the
        // parent and child class with the same name and the same input parameters

        BWM b = new BWM();
        b.start(); //Will prioritize the start method in child class
        b.antitheft();
        b.engine(); //it is inheriting the engine method from grand parent

        //Car object to call the Car method
        Car c = new Car();
        c.start();

        //A parent can not access methods from a child class but a child can access methods from a parent class.
        b.stop(); // b is accessing the stop() method from the parent class Car.

        Car c1 = new BWM(); //Child class object can be referred by a parent class reference variable -- Dynamic polymophism
        c1.start(); //start() from the BWM class
        c1.run(); //run() from the Car class

    }
}
