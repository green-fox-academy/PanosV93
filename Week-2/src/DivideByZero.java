import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        try {
          divideDouble();
          divideNumber();
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by Zero");
            e.printStackTrace();
        } catch (InputMismatchException e){
            System.out.println("Wrong Input");
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("Something went very wrong");
            e.printStackTrace();
        } finally {
            System.out.println("Reached Finally");
        }
        System.out.println("Exception handler method was finished successfully");
        

        }

         // divideDouble();
         // divideNumber();

    public static void divideNumber() {
        int numberToDivide = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your dividor");
        int dividor = sc.nextInt();
        System.out.println("The result of the division is: " + numberToDivide / dividor);

    }
    public static void divideDouble() {
        double numberToDivide = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your dividor");
        double dividor = sc.nextDouble();
        System.out.println("The result of the division is: " +numberToDivide/dividor);

    }
}