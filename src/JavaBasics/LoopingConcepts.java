package JavaBasics;

public class LoopingConcepts {

    public static void main (String[] args) {

        //While Loop
        int a = 1;
        while (a<=10) {

            System.out.println(a);
            a = a+1;
        }

        System.out.println("----------------------");

        for (int b = 1; b<=10; b++){

            //To print from 10 to 1, you use the decrement (b--) instead of b++

            System.out.println(b);
        }

    }
}
