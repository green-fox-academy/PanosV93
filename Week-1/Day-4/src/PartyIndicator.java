import java.util.Scanner;
public class PartyIndicator {
    public static void main(String args[]) {
        int girls;
        int boys;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Two Numbers, First for girls and second for boys : ");
        girls = scan.nextInt();
        boys = scan.nextInt();
        if (girls == 0){
            System.out.println("Sausage Party");}
        else if (girls + boys < 20){
            System.out.println("Average Party");}
        else if (girls + boys >=20 && boys!=girls) {
            System.out.println("Quite cool party");}
        else if (girls + boys >= 20){
            System.out.println("The party is excellent");}
    }
}