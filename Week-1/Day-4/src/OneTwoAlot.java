import java.util.Scanner;

public class OneTwoAlot {
    public static void main(String[] args) {
        int num;
        System.out.println("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num <=0 )
            System.out.println("Not enough");
        else if (num == 1)
            System.out.println("One");
        else if (num == 2)
            System.out.println("Two");
        else if (num > 2)
            System.out.println("A Lot");
    }
}
