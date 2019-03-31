package cn.com.timbrian.chapter2;

/**
 * @author Tim Brian
 * @since 2019年3月31日下午7:30:42
 * @description TODO
 */
public class ListNode {

	public Object data;
	public ListNode next;
	
	
	public ListNode() {
		this.data = null;
		this.next = null;
	}

	public ListNode(Object data) {
		this.data = data;
		this.next = null;
	}
	
	public ListNode(Object data, ListNode next) {
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		return "ListNode [data=" + data + ", next=" + next + "]";
	}
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = null;
		
		
		ListNode node0 = new ListNode(0, node1);
		
		System.out.println(node0);
		
	}
}
