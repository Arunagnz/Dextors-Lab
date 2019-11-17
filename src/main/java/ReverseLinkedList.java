/**
 * Created by arunagirinathanr
 * on 21/10/19 8:33 PM
 * for project dexters-lab
 * <p>
 * https://leetcode.com/problems/reverse-linked-list/
 * <p>
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 **/
public class ReverseLinkedList {
    public static SingleListNode reverseList(SingleListNode head) {
        SingleListNode result = null;
        while (head != null) {
            SingleListNode temp = head;
            head = head.next;
            temp.next = result;
            result = temp;
        }
        return result;
    }
}
