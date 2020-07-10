package JavaBasics;

public class ArraysInJava {

    public static void main (String[] args) {

        int i [] = new int [4];
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;

        //Prints out the value in index 4 of the Array
        System.out.println(i[3]);
        //To print out the length of the Array, we use the .length method
        System.out.println(i.length);
        //To print all the values of the array, we use the for loop

        for (int j = 0; j<i.length; j++) {

            System.out.println(i[j]);
        }
        //Double array
        double d[] = new double [3];
        d[0] = 1.2;
        d[1] = 2.2;
        d[2] = 4.4;

        System.out.println(d[2]);

        for (double g = 0; g<d.length; g++) {
            System.out.println(d[0]);
        }

        //String Array
        String s[] = new String[3];
        s[0] = "Hello";
        s[1] = "How";

        //Character Array
        char c[] = new char[2];
        c[0] = 'a';
        c[4] = 'b';

        //Object Array helps you store an array of multiple data types
        Object ob[] = new Object[5];
        ob[1] = "Allan";
        ob[2] = 'm';
        ob[3] = 22;
        ob[4] = 5.7;

    }
}
