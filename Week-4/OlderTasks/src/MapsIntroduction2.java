import java.util.HashMap;
import java.util.Map;

public class MapsIntroduction2 {
    public static void main(String[] args) {
        HashMap <String, String> myMap2 = new HashMap<>();
        myMap2.put("978-1-60309-452-8", "A letter to Jo");
        myMap2.put("978-1-60309-459-7", "Lupus");
        myMap2.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        myMap2.put("978-1-60309-461-0", "The Lab");

        for (Map.Entry<String, String> entries : myMap2.entrySet()){
            System.out.println(entries.getValue() + " (ISBN: " + entries.getKey() + ")");
        }
        myMap2.remove("978-1-60309-444-3");
        myMap2.remove("978-1-60309-461-0");
        myMap2.put("978-1-60309-450-4", "They Called Us Enemy");
        myMap2.put("978-1-60309-453-5", "Why Did We Trust Him?");

        System.out.println(myMap2.containsKey("478-0-61159-424-8"));
        System.out.println(myMap2.get(978-1-60309-453-5));

    }
}
