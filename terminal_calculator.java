import java.util.Scanner;

public class terminal_calculator {

    public static void calc() {
        // scan object
        Scanner scan = new Scanner(System.in);

        // now we will take two input in double
        System.out.print("Enter first number:");
        double fn = scan.nextDouble();
        System.out.print("Enter second number:");
        double sn = scan.nextDouble();

        // asking for operand
        System.out.println("Please choose the operand");
        System.out.println("1. Addition(+)");
        System.out.println("2. Subtraction(-)");
        System.out.println("3. Multiplication(*)");
        System.out.println("4. Division(/)");

        // taking input for choosing
        int choice = scan.nextInt();
        double result;

        // making the if-else loop
        if (choice == 1) {
            result = fn + sn;
            System.out.println("Result of addition is " + result);
        } else if (choice == 2) {
            result = fn - sn;
            System.out.println("Result of subtraction is " + result);
        } else if (choice == 3) {
            result = fn * sn;
            System.out.println("Result of multiplication is " + result);
        } else if (choice == 4) {
            if (sn == 0) {
                System.out.println("Invalid , Second number cannot be zero");
            } else {
                result = fn / sn;
                System.out.println("Result of division is " + result);
            }
        }
    }
    public static void main(String[] args) {
        int a = 1;
        Scanner scan = new Scanner(System.in);
        while (a==1) {
            calc();
            System.out.println("Do you want to continue calculating(y/n)only");
            char choice = scan.next().charAt(0);
            if (choice != 'y') {
                a = 0;
            }

        }
    }
}
