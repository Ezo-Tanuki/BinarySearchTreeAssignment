package WEEK9;

import java.util.Random;
import java.util.Scanner;

//Answer
class Functions{
    //A
    private int countElement(TreeNode node){
        if(node == null) return 0;
        return 1 + countElement(node.left) + countElement(node.right);
    }
    int countElement(BinaryTree BT){
        return countElement(BT.root);
    }
    //B

    private int sumElement(TreeNode<Integer> node){
        if(node == null) return 0;
        return node.key + sumElement(node.left) + sumElement(node.right);
    }
    int sumElement(BinarySearchTree BT){
        return sumElement(BT.root);
    }
    //C
    private int maxElement(TreeNode<Integer> node){
        if(node == null) return Integer.MIN_VALUE;
        return Math.max(node.key, Math.max(maxElement(node.left), maxElement(node.right)));
    }
    int maxElement(BinarySearchTree BT){
        if(BT.isEmpty()) return -1;
        return maxElement(BT.root);
    }
}

public class Main {


    public static void main(String[] args) {

        BinarySearchTree BST = new BinarySearchTree();
        for (int i = 0; i < 15; i++) BST.insert(new Random().nextInt(100));

        Functions f = new Functions();
        BST.printInorder();

        System.out.println();
        System.out.println(f.countElement(BST));
        System.out.println(f.sumElement(BST));
        System.out.println(f.maxElement(BST));
    }
}