import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many chickens do you have?");
        int numberOfChicken = input.nextInt();
        System.out.println("How many pigs do you have?");
        int numberOfPigs = input.nextInt();

        int chickenLegs = numberOfChicken * 2;
        int pigLegs = numberOfPigs * 4;
        int totalNumberOFLEgs = chickenLegs + pigLegs;
        System.out.println("The total number of legs is: " + totalNumberOFLEgs);
    }
}
