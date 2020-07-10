package OopConceptsPart1;

public class MethodOverLoading {

    public static void main (String[] args) {

        MethodOverLoading obj = new MethodOverLoading();
        obj.sum();
        obj.sum(60);
        obj.sum(2,3);

    }

    public void sum() {
        System.out.println("Method 1");
    }

    public void sum(int x) {
        System.out.println("Method 1");
        System.out.println("Method " + x);
    }

    public void sum(int x, int y) {
        System.out.println("Method 1");
        System.out.println("Method " +x);
    }
}
