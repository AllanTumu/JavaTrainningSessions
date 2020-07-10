package JavaBasics;

public class TwoDimensionalArray {
    public static void main (String[] args) {

        //2D Arrays
        Object s[][] = new Object[3][4];
        System.out.println(s.length);//Will print the number of rows
        System.out.println(s[0].length);

        s[0][1] = "Allan";
        s[0][2] = 'm';
        s[1][3] = 2.44;
        s[2][3] = 20;

        System.out.println(s[2][1]);
    }
}
