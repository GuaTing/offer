package ������9;

import java.util.Stack;

public class queue {
	// ����ջ��ջ1ѹ�룬ջ������
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		// ѹ��
		stack1.push(node);
	}

	public int pop() {
		if (stack2.empty()) {
			// ��ջ2�գ���ջ1����Ԫ�ص�����ѹ��ջ2
			while (!stack1.empty()) {
			stack2.push(stack1.pop());
		}
		}
		// ����
		return stack2.pop();
	}

	public static void main(String[] args) {
		// ���Ӳ���
		queue q = new queue();
		q.push(1);
		q.push(2);
		q.push(3);
		System.out.println(q.pop());
		q.push(4);
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
	}

}
