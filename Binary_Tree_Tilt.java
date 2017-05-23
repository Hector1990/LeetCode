import java.util.*; 

class Binary_Tree_Tilt {
	public static void main(String[] args) {
	}
	
	int tilt = 0;
	
	public int findTilt(TreeNode root) {
		postOrder(root);
		return tilt;
	}
	
	private int postOrder(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftSum = postOrder(root.left);
		int rightSum = postOrder(root.right);
		tilt += Math.abs(leftSum - rightSum);
		return leftSum + rightSum + root.val;
	}
	
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
}