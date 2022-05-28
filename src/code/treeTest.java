package code;

import com.sun.source.tree.BinaryTree;

public class treeTest {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node n4 = t.createNode(null, 6, null);
        Node n5 = t.createNode(null,7, null);
        Node n2 = t.createNode(n4,3, n5);
        Node n3 = t.createNode(null,5, null);
        Node n1 = t.createNode(n2,2, n3);

        t.setRoot(n1);
        t.inOrder(t.getRoot());

    }
}

class Node{
    int data;
    Node left;
    Node right;
}

class Tree{
    public  Node root;
    public void setRoot(Node node){
        this.root = node;
    }
    public Node getRoot() {
        return root;
    }

    public Node createNode(Node left, int data,Node right ){
        Node node = new Node();
        node.data = data;
        node.left = left;
        node.right = right;

        return node;
    }

    //중위 순회
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.data);
            inOrder(node.right);
        }
    }

    //전위순회
    public void preOrder(Node node){
        if(node !=null){
            System.out.println(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    //후위순회
    public void postOrder(Node node){
        if(node !=null){
            preOrder(node.left);
            preOrder(node.right);
            System.out.println(node.data);
        }
    }
}