package 面试题7;
//结点
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int x) {
		val = x;
	}
}

public class binarytree {

	public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		TreeNode root = buildTree(pre, in, 0, pre.length - 1, 0, in.length - 1);
		return root;
	}

	public static TreeNode buildTree(int[] pre, int[] in, int startPre, int endPre, int startIn, int endIn) {
		if (startPre > endPre || startIn > endIn) {
			return null;
		}
		TreeNode node = new TreeNode(pre[startPre]);
		for (int i = startIn; i <= endIn; i++) {
			if (in[i] == pre[startPre]) {
				int length = i - startIn;
				//递归查找左右子树
				node.left = buildTree(pre, in, startPre + 1, startPre + length, startIn, i - 1);
				node.right = buildTree(pre, in, startPre + length + 1, endPre, i + 1, endIn);
			}
		}
		return node;
	}
//利用前序遍历查看结果
	public static void preTraverse(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.val + ",");
		preTraverse(root.left);
		preTraverse(root.right);
	}
//例子测试
	public static void main(String[] args) {
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };

		TreeNode root = reConstructBinaryTree(pre, in);
		preTraverse(root);
	}

}
