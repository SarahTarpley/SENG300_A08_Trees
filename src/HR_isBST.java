// HackerRank "Is This a Binary Search Tree?"
// https://www.hackerrank.com/challenges/is-binary-search-tree/problem
public class HR_isBST extends BinarySearchTree{
	// Scope: 0 <= data <= 10^4
	
	// We needed a way to set the constraint only once
	// So the original caller is not recursive to accomplish this
	public static boolean checkBST(Node root) {
		// Remove null trees from the equation.
		//System.out.println("Received root: "+String.valueOf(root.data));
		if(root == null){
			System.out.println("Received null value");
			return false;
		}
		return checkBSTRecur(root, -11, (int) Math.pow(10, 4)+1);
	}
	
	public static boolean checkBSTRecur(Node root, int minVal, int maxVal) {
		// Innocent until proven guilty!
		boolean result = true;
		// All checks here are seeking a false response to end early
		if(root.left != null){
			if(root.left.data >= root.data){ //  || root.left.data >= maxVal
				return false;
			}
			else{
				result = checkBSTRecur(root.left, minVal, root.data);
			}
		}
		if(root.right != null && result != false){
			if(root.right.data <= root.data){ // || root.right.data <= minVal
				return false;
			}
			else{
				result = checkBSTRecur(root.right, root.data, maxVal);
			}
		}
		// Originally I added these pairs of switches up above with their respective left/right node
		// However that caused the leaf nodes to never be evaluated
		if(root.data >= maxVal || root.data <= minVal) {
			return false;
		}
		return result;
	}
}

/*
// Found a solution which did not need to check the child nodes
// This is the source of inspiration for adding the min/max values
// This solution was written much simpler, but would open more recursive calls (less efficient)
// This is due to never checking child nodes (has to open another call for the children)
// Furthermore, it will also return true if a null tree is passed in, whereas mine will return false

boolean checkBST(Node root) {
    return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
}

boolean isBST(Node root,int min , int max){
    if(root == null) return true;
    if(root.data>= max || root.data<=min) return false;
    return isBST(root.left,min,root.data) && isBST(root.right,root.data,max);
}
*/