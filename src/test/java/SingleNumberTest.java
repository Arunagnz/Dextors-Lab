import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by arunagirinathanr
 * on 21/10/19 8:53 PM
 * for project dexters-lab
 **/
public class SingleNumberTest {

    @Test
    public void singleNumber() {
        final int[] input = {1, 2, 3, 1, 3};
        int output = SingleNumber.singleNumber(input);

        assert output == 2;
    }
}