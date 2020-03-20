import java.util.Arrays;

public class Anagram {
    public boolean areAnagram(String string1, String string2) {
        char[] firstString = string1.toCharArray();
        char[] secondString = string2.toCharArray();

        Arrays.sort(firstString);
        Arrays.sort(secondString);

        return Arrays.equals(firstString,secondString);
    }
}
