package HackerRankExercises;

import java.util.Scanner;

public class EndOfLife {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int line_number = 1;
        while (scan.hasNext()) {
            System.out.println(line_number + " " + scan.nextLine());
            line_number++;
        }
        scan.close();
    }

}
