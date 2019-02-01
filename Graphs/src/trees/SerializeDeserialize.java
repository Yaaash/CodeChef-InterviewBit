package trees;

import java.util.ArrayList;
import java.util.Stack;

public class SerializeDeserialize {

    private static ArrayList<Integer> elements = new ArrayList<>();

    public static void main(String[] args) {

        // create tree
        Node head = new Node(20);
        head.left = new Node(8);
        head.right = new Node(22);

        Node headLeft = head.left;
        headLeft.left = new Node(4);
        headLeft.right = new Node(12);

        Node nextRight = headLeft.right;
        nextRight.left = new Node(10);
        nextRight.right = new Node(14);


        // print pre order
        preOrder(head);

        for(Integer i : elements)
        System.out.print(i);

        Node newHead = deserialize();

        System.out.println("\n\nNext\n");
        preOrder(newHead);
        for(Integer i : elements)
            System.out.print(i);
    }

    private static void inorder(Node head){
        Stack<Integer> stack = new Stack<>();
        Node node = head;
        while(node!= null){
            stack.push(node.value);
            node = node.left;
        }
        // node gets null - reached end of left
        System.out.print(stack.pop());
        // get root of tht left node
        System.out.print(stack.pop());
    }

    private static void preOrder(Node node) {

        if (node == null) {
            elements.add(-1);
            return;
        }

        elements.add(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    private static Node deserialize() {

        if (elements.isEmpty()) {
            return null;
        }
        int value = elements.remove(0);

        if (value == -1)
            return null;

        Node node = new Node(value);
        node.left = deserialize();
        node.right = deserialize();
        return node;
    }
}
