import java.util.Scanner;
public class ex30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, digit1, digit2, digit3, digit4, digit5;
        Scanner reader = new Scanner(System.in);
        System.out.print("\nEnter a 5 digit whole number : ");
        num = reader.nextInt();
        digit5 = num % 10;
        num = num / 10;
        digit4 = (num % 10);
        num = num / 10;
        digit3 = (num % 10);
        num = num / 10;
        digit2 = (num % 10 );
        num = num / 10;
        digit1 = (num % 10);
        System.out.print("\n" + digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5 + "\n");
    }
}

