package cn.keepingthepiggy.leetCode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class Two extends TestCase {
    @Override
    void newParam() {
        params = new Paramz[]{new Paramz(), new Paramz(), new Paramz()};
    }

    @Override
    void initParam() {
        ListNode nodeLeft = new ListNode(0);
        nodeLeft.next = new ListNode(1);
//        nodeLeft.next.next = new ListNode(7);

        ListNode nodeRight = new ListNode(0);
        nodeRight.next = new ListNode(1);
        nodeRight.next.next = new ListNode(2);


        params[0].listNode = nodeLeft;
        params[1].listNode = nodeRight;

        System.out.println(nodeLeft.toString());
        System.out.println(nodeRight.toString());
    }

    @Override
    void test() {
        ListNode l1 = params[0].listNode;
        ListNode l2 = params[1].listNode;

        ListNode sums = new ListNode(0);
        int carry = 0;
        ListNode p = l1;
        ListNode q = l2;
        ListNode r = sums;
        do {
            p = p == null ? new ListNode(0) : p;
            q = q == null ? new ListNode(0) : q;

            int sum = p.val + q.val + carry;
            if (sum > 9) {
                r.val = sum % 10;
                carry = 1;
            } else {
                r.val = sum;
                carry = 0;
            }

            p = p.next == null ? null : p.next;
            q = q.next == null ? null : q.next;
            r.next = (p == null && q ==null) ? null : new ListNode(0);
            r = r.next == null ? r : r.next;
        } while (p != null || q != null);

        if (carry > 0) {
            r.next = new ListNode(1);
        }

        System.out.println(sums.toString());

        params[2].listNode = sums;
    }
}
