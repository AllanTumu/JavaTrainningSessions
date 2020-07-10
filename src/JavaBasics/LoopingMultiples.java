package JavaBasics;

import java.util.Scanner;

public class LoopingMultiples {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Input Value
        int N = scanner.nextInt(); //Value of N = 1
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //declare another value i
        int i = 1;

        while (i<11) {
            int result = N*i;
            System.out.println(N +" X " +i +" = " +result);
            i++;
        }

        scanner.close();
    }
}
