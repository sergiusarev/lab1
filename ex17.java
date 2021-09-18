 import java.util.Scanner;
public class ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int sum;
        int average;
        int product;
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        System.out.print("Enter third integer: ");
        number3 = input.nextInt();
        sum = number1 + number2 + number3;
        System.out.printf("Sum:  %d%n", sum);
        average = sum/3;
        System.out.printf("Average is : %d%n ", average);
        product = number1 * number2 *number3;
        System.out.printf("Product is: %d%n", product);
        if (number1>number2 && number3>number2)
            System.out.printf("Is larger:  %d > %d%n < %d%n", number1, number2, number3);
        if(number2<number1 && number2<number3)
            System.out.printf("Is smaller:  %d%n > %d%n < %d%n", number1, number2, number3);
    }
}
