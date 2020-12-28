import java.util.LinkedList;

public class MergeTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	  public class ListNode {
	     int val;
	      ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }

	/*Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]*/
	
 /*   public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	
    	ListNode node = new ListNode();
    	ListNode start = node;
    	while(l1!=null && l2!=null) {
    		if(l1.val <l2.val) {
    			node.next = new ListNode(l1.val);
    			node = node.next;
    			l1 = l1.next;
    		}else {
    			node.next = new ListNode(l2.val);
    			node = node.next;
    			l2 = l2.next;
    		}
    	}
    	
    	while(l1 !=null){
    		node.next = new ListNode(l1.val);
    		node = node.next;
    		l1 = l1.next;
    	}
    	while(l1 !=null){
    		node.next = new ListNode(l2.val);
    		node = node.next;
    		l2 = l2.next;
    	}
    	
    	return start.next;
    	
    }
 */   
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1 == null) return l2;
            if(l2 == null) return l1;
            ListNode tmp,ans;
            if(l1.val <= l2.val){
                tmp = l1;
                l1 = l1.next;
            }else{
                tmp = l2;
                l2 = l2.next;
            }
            ans = tmp;

            while(l1 != null && l2 != null){
                if(l1.val <= l2.val){
                    tmp.next = l1;
                    tmp = tmp.next;
                    l1 = l1.next;
                }else{
                    tmp.next = l2;
                    tmp = tmp.next;
                    l2 = l2.next;
                }
            }
            if(l2 == null) tmp.next = l1;
            else tmp.next = l2;
            return ans;
            }
        }
    
    
/*My own implementation using LinkedList
 * import java.util.LinkedList;

public class Linky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list2.add(1);
		list2.add(3);
		list2.add(4);
		
		merge(list1, list2);
	}
	
	public static void merge(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		LinkedList<Integer> merged = new LinkedList<Integer>();

		
		while(!l1.isEmpty()&&!l2.isEmpty()) {
			if(l1.element()<l2.element()) {
				merged.add(l1.element());
				l1.remove();
				
			}else {
				merged.add(l2.element());
				l2.remove();
			}

		}
		if(!l1.isEmpty()) {
			merged.add(l1.element());
			l1.remove();
		}
		if(!l2.isEmpty()) {
			merged.add(l2.element());
			l2.remove();
		}
		
		System.out.println(merged);
		
	}

}

 */

}
