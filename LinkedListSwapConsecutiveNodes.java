class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListSwapConsecutiveNodes {
    public static ListNode swapConsecutiveNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Empty list or single node
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null && current.next != null) {
            ListNode next = current.next;
            current.next = next.next;
            next.next = current;
            prev.next = next;

            prev = current;
            current = current.next;
        }

        return dummy.next;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage:
        ListNode originalList = new ListNode(1);
        originalList.next = new ListNode(2);
        originalList.next.next = new ListNode(3);
        originalList.next.next.next = new ListNode(4);
        originalList.next.next.next.next = new ListNode(5);
        originalList.next.next.next.next.next = new ListNode(6);
        originalList.next.next.next.next.next.next = new ListNode(7);
        originalList.next.next.next.next.next.next.next = new ListNode(8);

        ListNode modifiedList = swapConsecutiveNodes(originalList);
        printList(modifiedList); // Print the modified list
    }
}