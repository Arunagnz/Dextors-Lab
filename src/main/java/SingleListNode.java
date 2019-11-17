import java.util.*;

/**
 * Created by arunagirinathanr
 * on 21/10/19 8:36 PM
 * for project dexters-lab
 * <p>
 * Singly linked list implementation
 **/
public class SingleListNode {
    int val;
    SingleListNode next;

    SingleListNode(int x) {
        val = x;
    }

    SingleListNode(List<Integer> elements) {
        Queue<Integer> values = new PriorityQueue<>(elements);
        this.val = values.poll();
        SingleListNode current = this;
        while (values.iterator().hasNext()) {
            current.next = new SingleListNode(values.poll());
            current = current.next;
        }
    }

    @Override
    public String toString() {
        return this.toList().toString();
    }

    public List<Integer> toList() {
        List<Integer> result = new ArrayList<>();
        SingleListNode current = this;
        while (current != null) {
            result.add(current.val);
            current = current.next;
        }
        return result;
    }
}
