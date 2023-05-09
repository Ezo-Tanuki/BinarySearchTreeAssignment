package WEEK9;

class TreeNode<E>{
    E key;
    TreeNode<E> left;
    TreeNode<E> right;



    public TreeNode(E key){
        this.key = key;
    }

    public TreeNode(){}

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}

public class BinaryTree<E>{
    TreeNode root;
    public BinaryTree(){
        this.root = null;
    }

    public BinaryTree(TreeNode<E> root){
        this.root = root;
    }

    public boolean isEmpty(){return this.root == null;}

    public void printInorder(){
        printInorder(this.root);
    }
    private void printInorder(TreeNode<E> currentNode){
        if(currentNode == null) return;
        printInorder(currentNode.left);
        System.out.print(currentNode.key + " ");
        printInorder(currentNode.right);
    }

    public void printPreorder(){
        printPreorder(this.root);
    }
    private void printPreorder(TreeNode currentNode){
        if(currentNode == null) return;
        System.out.print(currentNode.key + " ");
        printInorder(currentNode.left);
        printInorder(currentNode.right);
    }
}