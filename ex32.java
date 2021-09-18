import java.util.Scanner;
public class ex32 {
    public static void main(String[] args) {
        Scanner value = new Scanner (System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int numPositive = 0;
        int numZero = 0;
        int numNegative = 0;
        System.out.print ("Enter your first number: ");
        num1 = value.nextInt();
        System.out.print ("Enter your second number: ");
        num2 = value.nextInt();
        System.out.print ("Enter your third number: ");
        num3 = value.nextInt();
        System.out.print ("Enter your fourth number: ");
        num4 = value.nextInt();
        System.out.print ("Enter your fifth number: ");
        num5 = value.nextInt();
        if (num1 > 0)
            numPositive = numPositive + 1;
        if (num2 > 0)
            numPositive = numPositive + 1;
        if (num3 > 0)
            numPositive = numPositive + 1;
        if (num4 > 0)
            numPositive = numPositive + 1;
        if (num5 > 0)
            numPositive = numPositive + 1;
        if (num1 < 0)
            numNegative = numNegative + 1;
        if (num2 < 0)
            numNegative = numNegative + 1;
        if (num3 < 0)
            numNegative = numNegative + 1;
        if (num4 < 0)
            numNegative = numNegative + 1;
        if (num5 < 0)
            numNegative = numNegative + 1;
        if (num1 == 0)
            numZero = numZero + 1;
        if (num2 == 0)
            numZero = numZero + 1;
        if (num3 == 0)
            numZero = numZero + 1;
        if (num4 == 0)
            numZero = numZero + 1;
        if (num5 == 0)
            numZero = numZero + 1;
        System.out.println ("\n");
        System.out.printf ("Positive numbers = %d\n", numPositive);
        System.out.printf ("Negative numbers = %d\n", numNegative);
        System.out.printf ("Zero numbers = %d\n", numZero);
    }
}

