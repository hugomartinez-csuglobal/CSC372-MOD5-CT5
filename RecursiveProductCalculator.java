import java.util.Scanner;

public class RecursiveProductCalculator {

    // Recursive method to calculate the product
    public static int calculateProduct(int[] numbers, int index) {
        if (index == 0) {
            return numbers[0]; // Base case
        }
        return numbers[index] * calculateProduct(numbers, index - 1); // Recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers to calculate their product:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int product = calculateProduct(numbers, numbers.length - 1);
        System.out.println("The product of the entered numbers is: " + product);
    }
}
