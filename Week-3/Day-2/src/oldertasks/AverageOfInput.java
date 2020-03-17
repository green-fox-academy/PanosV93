import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 whole numbers, in order to provide their sum and their average");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        int sum = a + b + c + d + e;
        double average = sum / 5;

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);

    }
}
