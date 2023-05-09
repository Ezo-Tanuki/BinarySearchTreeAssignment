package WEEK9;

public class BinarySearchTree extends BinaryTree<Integer> {

    public BinarySearchTree(){
        super();
    }

    public BinarySearchTree(TreeNode<Integer> root){
        super(root);
    }

    public void insert(int key){
        if(this.root == null){
            this.root = new TreeNode<Integer>(key);
            return;
        }

        TreeNode<Integer> currentNode = this.root;
        TreeNode<Integer> prevNode = null;
        int dif = 0;
        while(currentNode != null){
            prevNode = currentNode;
            dif = currentNode.key - key;
            currentNode = dif > 0 ? currentNode.left : currentNode.right;
        }

        if(dif > 0) prevNode.left = new TreeNode<>(key);
        else prevNode.right = new TreeNode<>(key);
    }
}
