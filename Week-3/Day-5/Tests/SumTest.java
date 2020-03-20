import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

    Sum checkSum = new Sum();

    @Test
    public void checkSumMethod() {
        ArrayList<Integer> testInt = new ArrayList<Integer>();
        testInt.add(5);
        testInt.add(25);
        testInt.add(30);
        assertEquals(60,checkSum.getSum(testInt));
    }

    @Test
    public void emptyList() {
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        assertEquals(0, checkSum.getSum(emptyList));
    }

    @Test
    public void oneElement(){
        ArrayList<Integer> oneElement = new ArrayList<Integer>();
        oneElement.add(25);
        assertEquals(25,checkSum.getSum(oneElement));
    }

    @Test
    public void nullArray(){
        ArrayList<Integer> nullArray = null;
        assertEquals(0,checkSum.getSum(nullArray));
    }

}