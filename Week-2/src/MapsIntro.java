import java.util.HashMap;
import java.util.Map;

public class MapsIntro {
    public static void main(String[] args) {
        HashMap<Integer,String> newMap = new HashMap<Integer, String>();
        if (newMap == null) {
            System.out.println("The map is empty");
        }
        else System.out.println("The map is filled");

        newMap.put(97, "a");
        newMap.put(98, "b");
        newMap.put(99, "c");
        newMap.put(65, "A");
        newMap.put(66, "B");
        newMap.put(67, "C");
        newMap.put(68, "D");
        for (Map.Entry <Integer, String> item : newMap.entrySet()){
            item.getKey();
            item.getValue();
        }
        System.out.println(newMap);

        // String returned_value = (String)newMap.remove(97); (remove specific key-pair value)

        //  System.out.println(newMap.get(99));               (Gives value for specific key)


        //  for (Integer key: newMap.keySet()){
        //      System.out.println(key);                      (Prints Keys)
        //  }



        //  for (String values: newMap.values()){
        //      System.out.println(values);                   (Prints Values)
        //  }
    }
}
