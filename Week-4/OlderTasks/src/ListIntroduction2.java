import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        ArrayList<String> list2 = new ArrayList<>(list1);
        System.out.println(list1.contains("Durian"));
        list2.remove(3);
        list1.add(4, "Kiwifruit");
        list1.equals(list2);
        list1.indexOf("Avocado");
        list2.indexOf("Durian");
        list2.addAll(Arrays.asList("Passion Fruit", "Pomelo"));
        System.out.println(list2);
        System.out.println(list1.get(2));

    }
}
