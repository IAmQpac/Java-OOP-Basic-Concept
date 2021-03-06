package Lab08;

//Java program to find height of tree 

//A binary tree node 
public class TreeHeight 
{ 
	int data; 
	TreeHeight left, right; 

	TreeHeight(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

class BinaryTree 
{ 
	TreeHeight root; 

	/* Compute the "maxDepth" of a tree -- the number of 
	nodes along the longest path from the root node 
	down to the farthest leaf node.*/
	int maxDepth(TreeHeight node) 
	{ 
		if (node == null) 
			return 0; 
		else
		{ 
			/* compute the depth of each subtree */
			int lDepth = maxDepth(node.left); 
			int rDepth = maxDepth(node.right); 

			/* use the larger one */
			if (lDepth > rDepth) 
				return (lDepth + 1); 
			else
				return (rDepth + 1); 
		} 
	} 
	
	/* Driver program to test above functions */
	public static void main(String[] args) 
	{ 
		BinaryTree tree = new BinaryTree(); 

		tree.root = new TreeHeight(1); 
		tree.root.left = new TreeHeight(2); 
		tree.root.right = new TreeHeight(3); 
		tree.root.left.left = new TreeHeight(4); 
		tree.root.left.right = new TreeHeight(5); 

		System.out.println("Height of tree is : " + 
									tree.maxDepth(tree.root)); 
	} 
} 

//This code has been contributed by Mayank Jaiswal(mayank_24) 


