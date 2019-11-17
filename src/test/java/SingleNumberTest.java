import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by arunagirinathanr
 * on 21/10/19 8:53 PM
 * for project dexters-lab
 **/
public class SingleNumberTest {

    @Test
    public void singleNumber1() {
        final int[] input = {1, 2, 3, 1, 3};
        int output = SingleNumber.singleNumber(input);

        assertEquals(2, output);
    }

    @Test
    public void singleNumber2() {
        final int[] input = {1, 2, 2};
        int output = SingleNumber.singleNumber(input);

        assertEquals(1, output);
    }

    @Test
    public void singleNumber3() {
        final int[] input = {12};
        int output = SingleNumber.singleNumber(input);

        assertEquals(12, output);
    }
}