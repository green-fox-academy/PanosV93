public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        StringBuilder quoteADD = new StringBuilder(quote);

        quoteADD.insert(21  ,"always takes longer than ");

        quote = quoteADD.toString();

        System.out.println(quote);
    }
}
// find the index of you and get the number