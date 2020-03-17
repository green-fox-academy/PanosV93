package BlogPost;

public class blogSpotObjects {

    public static void main(String[] args) {
        blogPost entry1;
        entry1 = new blogPost();
        entry1.authorName = "John Doe ";
        entry1.publicationDate = "2000.05.04. ";
        entry1.text = "Lorem ipsum dolor sit amet ";
        entry1.title = "Lorem Ipsum \n";

        blogPost entry2;
        entry2 = new blogPost();
        entry2.authorName = "Tim Urban ";
        entry2.publicationDate = "2010.10.10. ";
        entry2.text = "A popular long-form, stick-figure-illustrated blog about almost everything ";
        entry2.title = "Wait but why \n";

        blogPost entry3;
        entry3 = new blogPost();
        entry3.authorName = "William Turton ";
        entry3.publicationDate = "2017.03.28. ";
        entry3.text = "Daniel Hanley, a cybersecurity engineer at IBM,doesn't want to be the center of attention.\n When I asked to take his picture outside one of IBM's New York City offices, \nhe told me that he wasn't really into the whole organizer profile thing";
        entry3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump ";

        entry1.BlogPost();
        entry2.BlogPost();
        entry3.BlogPost();
    }
}
