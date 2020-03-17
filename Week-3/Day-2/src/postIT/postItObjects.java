package postIT;

public class postItObjects {

    public static void main(String[] args) {
        PostItTClass postit1;
        postit1 = new PostItTClass();
        postit1.backgroundColor = "Orange";
        postit1.text = "Idea 1";
        postit1.textColor = "Blue\n";

        PostItTClass postit2;
        postit2 = new PostItTClass();
        postit2.backgroundColor = "Pink";
        postit2.text = "Awesome";
        postit2.textColor = "Black\n";

        PostItTClass postit3;
        postit3 = new PostItTClass();
        postit3.backgroundColor = "Yellow";
        postit3.text = "Superb";
        postit3.textColor = "Green";



        postit1.notes();
        postit2.notes();
        postit3.notes();


    }
}
