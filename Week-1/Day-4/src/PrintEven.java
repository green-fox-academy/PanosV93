public class PrintEven {
    public static void main(String args[]) {
        int n = 500;
        System.out.print("Even Numbers from 1 to "+n+" are: ");
        for (int i = 0; i <= n; i++) {
            //if number%2 == 0 it means its an even number
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
