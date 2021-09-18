import java.util.Scanner;
public class ex31 {
    public static void main( String args[] ) {
        // print a header for the table
        System.out.printf("%s\t%s\t%s\n", "number", "square", "cube");
        for (int i = 0; i <= 10; i++)
            System.out.printf("%d\t\t%d\t\t%d\n", i, (i * i), (i * i * i));
    }
}
