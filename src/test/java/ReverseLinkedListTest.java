import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * Created by arunagirinathanr
 * on 21/10/19 8:40 PM
 * for project dexters-lab
 **/
public class ReverseLinkedListTest {

    @Test
    public void reverseList() {
        SingleListNode input = new SingleListNode(asList(1, 2, 3, 4, 5));
        assertEquals(asList(5, 4, 3, 2, 1), ReverseLinkedList.reverseList(input).toList());
    }
}