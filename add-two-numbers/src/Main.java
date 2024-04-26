public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4, new ListNode(3));

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6, new ListNode(4));

        int l1Sum = l1.val + 10 * l1.next.val + 100 * l1.next.next.val;
        int l2Sum = l2.val + 10 * l2.next.val + 100 * l2.next.next.val;
        int sum = l1Sum + l2Sum;

        ListNode total = new ListNode(sum % 100);
        total.next = new ListNode((sum % 100) / 10, new ListNode(sum / 100));

        System.out.println(total.val + " " + total.next.val + " " + total.next.next.val);
        System.out.println(" ");
        int count = 1;
        System.out.println(countListNodeNodes(total, count));
    }

    public static int countListNodeNodes(ListNode list, int count) {
        if (list.next == null) {
            return count;
        } else {
            count++;
            count = countListNodeNodes(list.next, count);
        }
        return count;
    }

    public static int sumListNodeNodes(ListNode list) {
        int sum = 0;

        if (list.next == null) {
            return sum;
        } else {
            sum += ;
            count = countListNodeNodes(list.next, count);
        }
        return count;
    }

    public static ListNode reverseListNodeNodes(ListNode listNode, int listNodeNodesCount) {
        //if there is only one node in the list then return as is
        if(listNodeNodesCount == 1) {
            return listNode;
        }
        ListNode listNodeReversed = new ListNode();
        //if there is more than one node set the 1st node
        if(listNode.next == null) {
            return listNodeReversed;
        } else {
            list
        }
    }

    public static int sumListNodes(ListNode listNode, int ListNodeNodesCount) {
        for()
    }
    public static int sumReverseListNodes (ListNode listNode) {
        int sum = listNode.val;

        if (listNode.next == null) {
            return sum;
        } else {
            sum += sumReverseListNodes(listNode.next);
        }
        return sum;
    }
}