import java.util.Scanner;
public class KMtoMiles {
    public static void main(String[] args) {

        double miles;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter miles in double format, for example 14.2: ");
        miles = in.nextDouble();

        double kilometers = miles * 1.6;

        System.out.println(kilometers + " Kilometers");

    }
}