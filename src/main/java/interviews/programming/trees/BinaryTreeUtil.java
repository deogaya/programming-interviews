package interviews.programming.trees;

public class BinaryTreeUtil {

	public static TreeNode getBinaryTree(String inputStr) {
		String[] input = inputStr.split(",");
		return getTree(input, 1);
	}

	private static TreeNode getTree(String[] input, int index) {
		TreeNode node = null;
		try {
			if (index <= input.length) {
				node = new TreeNode(Integer.parseInt(input[index - 1]));
				node.left = getTree(input, 2 * index);
				node.right = getTree(input, 2 * index + 1);
			}
		} catch (Exception e) {
		}
		return node;
	}

	public static void printTree(TreeNode node) {
		if (node != null) {
			System.out.print(node.val);
			if (node.left != null) {
				System.out.print("L" + node.left.val);	
			}
			if (node.right != null) {
				System.out.print("R" + node.right.val);
			}
			System.out.println();
			printTree(node.left);
			printTree(node.right);
		}
	}

	public static void main(String[] args) {
		String inputStr = "1,2,3,#,4,#,5,#,#,6,7,#,#,8,9";
		BinaryTreeUtil.printTree(BinaryTreeUtil.getBinaryTree(inputStr));
	}
}
