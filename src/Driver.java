public class Driver {
    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        BinarySearchTree bt2 = new BinarySearchTree();
        //Add nodes to the binary tree
        bt.insert(12);
        bt.insert(56);
        bt.insert(31);
        bt.insert(-10);
        bt.insert(8);
        bt2.insert(7);
        bt.insert(7);
        bt.insert(4);
        bt.insert(2);
        bt.insert(11);
        bt2.insert(11);
        //Display traversal methods
        System.out.print("Binary search tree with Pre Order Traversal:    ");		bt.preorderTraversal(bt.root);
        System.out.println("\n");
        System.out.print("Binary search tree with Post Order Traversal:    ");	bt.postorderTraversal(bt.root);
        System.out.println("\n");
        System.out.print("Binary search tree with In Order Traversal:    ");		bt.inorderTraversal(bt.root);
        System.out.println("\n");
        System.out.println("\n\nIs it a binary search tree?: " + HR_isBST.checkBST(bt.root));
        System.out.println(String.valueOf(Math.pow(10, 4)));
    }
}
