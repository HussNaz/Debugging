import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DebugPractice debugPractice = new DebugPractice();

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        int result = debugPractice.calculate(5, 3);


        System.out.println("Result: " + result);
    }
}