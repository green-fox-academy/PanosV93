import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {
        ArrayList<String> NameList = new ArrayList<>();
        NameList.add("William");
        NameList.add("\nJohn");
        NameList.add("\nAmanda");
      //  NameList.remove(0); removes first Element.
      //  NameList.removeAll(NameList);
        System.out.println(NameList);

}
}

//sout(NameList.size()); will give the number of elements
//System.out.println(NameList.get(2)); in order to get the 3rd element