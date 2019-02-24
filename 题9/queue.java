package 面试题9;

import java.util.Stack;

public class queue {
	// 两个栈，栈1压入，栈二弹出
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		// 压入
		stack1.push(node);
	}

	public int pop() {
		if (stack2.empty()) {
			// 当栈2空，将栈1所有元素弹出并压入栈2
			while (!stack1.empty()) {
			stack2.push(stack1.pop());
		}
		}
		// 弹出
		return stack2.pop();
	}

	public static void main(String[] args) {
		// 例子测试
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
