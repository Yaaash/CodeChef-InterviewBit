package trees;

public class BoundaryTraversal {

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


        // print
        boundaryLeft(head);
        leaveNodes(head);
        boundaryRight(head.right);
    }

    private static void boundaryLeft(Node head) {
        if (head != null) {
            if (head.left != null) {
                System.out.println(head.value);
                boundaryLeft(head.left);
                }else if (head.right!= null){
                    boundaryLeft(head.right);
                }
        }
    }

    private static void leaveNodes(Node head){
        if(head != null){
            leaveNodes(head.left);
            if(head.left == null && head.right == null)
                System.out.println(head.value);
            leaveNodes(head.right);
        }
    }

    private static void boundaryRight(Node head){
        if (head != null) {
            if (head.right != null) {
                boundaryRight(head.right);
                System.out.println(head.value);
            }else if (head.left != null){
                boundaryRight(head.left);
            }
        }
    }

}
