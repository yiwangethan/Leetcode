package leetcode;

class removenthfromend {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	ListNode first = dummy;
    	ListNode second = dummy;
    	for(int i=1; i<=n+1;i++) {
    		first = first.next;
    	}
    	while(first!=null) {
    		first = first.next;
    		second  = second.next;
    	}
    	second.next = second.next.next;
    	return dummy.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		ListNode six = new ListNode(6);
		ListNode seven = new ListNode(7);
		one.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
		five.next=six;
		six.next=seven;
		
		ListNode ans = removeNthFromEnd(one,2);
		/*while(node!=null) {
			System.out.print(node.val+" ");
			node = node.next;
		}*/
		while(ans!=null) {
			System.out.print(ans.val+" ");
			ans = ans.next;
		}
		
		
		

	}

}
