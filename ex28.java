import java.util.Scanner;
public class ex28 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int r;
        System.out.print("Enter the radius of the circle: ");
        r = input.nextInt();

        System.out.printf("Diameter of the circle is %d\n", (2 * r));
        System.out.printf("Circumference of the circle is %.2f\n", (2* (Math.PI) * r));
        System.out.printf("Area of the circle is %.2f\n", ((Math.PI) * (r * r)));
    }
}
