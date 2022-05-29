package code;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);

        node1.left = node2;
        node1.right = node4;

        node2.left = node5;
        node2.right = node3;

        node3.right=node7;

        node4.left=node6;
        node4.right=node8;

    }
}
