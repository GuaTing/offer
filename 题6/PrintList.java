package ������6;

import java.util.ArrayList;
import java.util.Stack;
//������
class ListNode {
	int val;
	ListNode next = null;
	ListNode() {
	}
	ListNode(int val) {
		this.val = val;
	}
}

public class PrintList {
	public static void PrintListReverse(ListNode listNode) {
		if (listNode == null)
			System.out.println("null");
		Stack<Integer> stack = new Stack<Integer>();
		while (listNode != null) {
			//��ջ
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		while (!stack.isEmpty()) {
			//��ջ
			System.out.print(stack.pop()+" ");
		}
	}

	public static void main(String[] args) {
		//���Ӳ���
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		a.next = b;
		b.next = c;
		PrintListReverse(a);
	}

}
