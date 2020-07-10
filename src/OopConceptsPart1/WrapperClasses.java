package OopConceptsPart1;

public class WrapperClasses {
    public static void main(String[] args) {
        String x = "100";
        String d = "12.33";

        //Convert String to integer (Data Conversion)
        int y = Integer.parseInt(x);

        //Print Y
        System.out.println(y);

        //Converting String to Double
        Double z = Double.parseDouble(d);

        //Print z
        System.out.println(z);

        //Converting Integer to string
        int j = 100;
        String n = String.valueOf(j);
        System.out.println(n);
    }
}
