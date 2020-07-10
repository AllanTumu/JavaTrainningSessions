package HackerRankExercises;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = String.valueOf(n);
        if (n>=-100 && n<=100) {
            System.out.println("Good job");
        }
        else {
            System.out.println("Wrong answer");
        }
    }
}
