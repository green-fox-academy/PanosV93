public class ChangeElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 8, 5, 6};
        for (int i = 0; i <numbers.length ; i++) {
            if (i == 3) {
                numbers[3] = 4;
                System.out.println(numbers [3]);

            }

        }

    }
}
//int a = 8 (Gabi's way)
// if (numbers[i] == a) {numbers[i] = 4;}