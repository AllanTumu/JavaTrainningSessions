package OopConceptsPart1;

public class CallbyValAndCallByRef {
    public static void main(String[] args) {
        CallbyValAndCallByRef obj = new CallbyValAndCallByRef();

        int x = 10;
        int y = 20;

        obj.testSum(x,y); //Call by Value or Pass by value
        System.out.println(obj.testSum(x,y));

    }

    public int testSum (int a, int b) {

        a=30;
        b=40;
        int c = a+b;
        return c;
    }
}
