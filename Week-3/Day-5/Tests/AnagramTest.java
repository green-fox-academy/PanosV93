import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void areTheWordsAnagram(){
        Anagram anagram = new Anagram();
        String word1 = "evil";
        String word2 = "vile";
        assertEquals(true,anagram.areAnagram(word1,word2) );
    }

    @Test
    public void areAnagramAssertTrueMethod(){
        Anagram anagram = new Anagram();
        String word1 = "evil";
        String word2 = "vile";
        assertTrue (anagram.areAnagram(word1,word2) );
    }

}