import java.util.ArrayList;

public class Sum {
    public int getSum(ArrayList<Integer> arraySum){
        ArrayList<Integer> resultSum = new ArrayList<Integer>();
        int result = 0;
        try {
            for (int i = 0; i <arraySum.size() ; i++) {
                result += arraySum.get(i);
            }
        }
        catch (NullPointerException e){
            System.out.println("Cannot divide by zero");
        }

        return result;

    }
}
