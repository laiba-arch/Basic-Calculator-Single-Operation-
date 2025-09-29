import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double a, b, d;
        char c;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = s1.nextDouble();

        System.out.print("Enter operator:");
        c = s1.next().charAt(0);

        System.out.print("Enter second number: ");
        b = s1.nextDouble();
        s1.close();

        switch (c) {
            case '+':
                d = a + b;
                System.out.println("a + b = " + d);
                break;
            case '-':
                d = a - b;
                System.out.println("a - b = " + d);
                break;
            case '*':
                d = a * b;
                System.out.println("a * b = " + d);
                break;
            case '/':
                if (b != 0) {
                    d = a / b;
                    System.out.println("a / b = " + d);
                } else {
                    System.out.println("Error: Division by zero! Enter number greater than 0. ");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}