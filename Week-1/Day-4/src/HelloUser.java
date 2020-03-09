import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {
        //creates Scanner
        Scanner scanner = new Scanner(System.in);
        // The program stops and waits for user input and to press enter
        String userInput1 = scanner.nextLine();
        // It prints the whole line that was given by the user
        System.out.println("Hello There! What is your name?");
        // The program stops and waits for user input that is an integer and to press enter
        String userInput2 = scanner.nextLine();
        // It prints the integer
        System.out.println("Pleasure to meet you, " + userInput2);

    }
}
