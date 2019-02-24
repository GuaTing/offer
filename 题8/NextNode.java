package 面试题8;

import javax.swing.tree.TreeNode;

class TreeLinkNode {
	int val;
	TreeLinkNode left = null;
	TreeLinkNode right = null;
	TreeLinkNode parent = null;

	TreeLinkNode(int val) {
		this.val = val;
	}
}

public class NextNode {
	public static TreeLinkNode GetNext(TreeLinkNode pNode) {

		if (pNode == null) {
			return null;
		}
		TreeLinkNode nextNode = null;
		//节点有右子树
		if (pNode.right != null) {
			TreeLinkNode tempNode = pNode.right;
			//最左节点
			while (tempNode.left != null) {
				tempNode = tempNode.left;
			}

			return tempNode;
		}

		//父节点
		TreeLinkNode next = pNode.parent;
		if (pNode.right == null && next != null) {
			if (next.left == pNode) {
				//节点没有右子树，且是父亲的左子节点
				TreeLinkNode temp = pNode.parent;
				return temp;

			}

			if (next.right == pNode) {
				//节点没有右子树，且是父亲的右子节点
				TreeLinkNode p = pNode.parent;
				while (p.parent != null) {
					TreeLinkNode nextP = p.parent;
					if (nextP.left == p) {
						return nextP;
					} else {
						p = p.parent;
					}
				}
				nextNode = null;

			}
		}

		return nextNode;

	}

	public static void main(String[] args) {
		//例子测试
		TreeLinkNode a = new TreeLinkNode(1);
		TreeLinkNode b = new TreeLinkNode(2);
		TreeLinkNode c = new TreeLinkNode(3);
		TreeLinkNode d = new TreeLinkNode(4);
		TreeLinkNode e = new TreeLinkNode(5);
		TreeLinkNode f = new TreeLinkNode(6);
		TreeLinkNode g = new TreeLinkNode(7);
		TreeLinkNode h = new TreeLinkNode(8);
		TreeLinkNode i = new TreeLinkNode(9);
		a.left=b;
		a.right=c;
		b.left=d;
		b.right=e;
		b.parent=a;
		c.left=f;
		c.right=g;
		c.parent=a;
		d.parent=b;
		e.left=h;
		e.right=i;
		f.parent=c;
		g.parent=c;
		h.parent=e;
		i.parent=e;
		TreeLinkNode[] array = {d,b,h};
		TreeLinkNode next = GetNext(array[array.length-1]);
		System.out.println(next.val);
	}

}
