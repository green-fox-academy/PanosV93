import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide a number in order to see It's multiplication table");
        int number = input.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i + "* " + number + "= " +(i*number));

        }
    }
}
