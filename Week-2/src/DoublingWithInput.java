import java.util.Scanner;
public class DoublingWithInput {
    public static void main(String[] args) {
        System.out.println("Please Enter a number ");
        Scanner scanner = new Scanner(System.in);
        int myNum = scanner.nextInt();
        System.out.println(DoubleOrNothing(myNum));
    }
    public static int DoubleOrNothing(int input) {
//at the (int input) it is just a name, you can use any
        return input * 2;
    }
}
