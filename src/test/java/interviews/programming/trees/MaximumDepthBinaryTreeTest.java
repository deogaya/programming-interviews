package interviews.programming.trees;

import org.junit.Assert;
import org.junit.Test;

public class MaximumDepthBinaryTreeTest {

	MaximumDepthBinaryTree maximumDepthBinaryTree = new MaximumDepthBinaryTree();

	@Test
	public void test() {
		Assert.assertEquals(0, maximumDepthBinaryTree.maxDepth(BinaryTreeUtil.getBinaryTree("")));
		Assert.assertEquals(1, maximumDepthBinaryTree.maxDepth(BinaryTreeUtil.getBinaryTree("1")));
		Assert.assertEquals(2, maximumDepthBinaryTree.maxDepth(BinaryTreeUtil.getBinaryTree("1,#,2")));
		Assert.assertEquals(2, maximumDepthBinaryTree.maxDepth(BinaryTreeUtil.getBinaryTree("1,2,3")));
		Assert.assertEquals(3, maximumDepthBinaryTree.maxDepth(BinaryTreeUtil.getBinaryTree("1,2,3,4")));
		Assert.assertEquals(4, maximumDepthBinaryTree.maxDepth(BinaryTreeUtil.getBinaryTree("1,2,3,4,#,#,#,5")));
	}

}
