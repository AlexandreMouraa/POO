class ListNode 
{
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class LinkedList 
{

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) 
        {
            int sum = carry;

            if (l1 != null) 
            {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) 
            {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }

        return dummy.next;
    }

    public static void main(String [] args)
    {
        // Create the input linked lists
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);
        
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        
        // Create an instance of LinkedList class
        LinkedList list = new LinkedList();
        
        // Calculate the sum of the two linked lists
        ListNode result = list.addTwoNumbers(l1, l2);
        
        // Print the result
        while (result != null) 
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

