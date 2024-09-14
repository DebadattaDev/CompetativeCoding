package org.example.Tree;

class Node1 {
    int val;
    Node1 left;
    Node1 right;
    Node1 next;

    Node1(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
        this.next = null;
    }
}

public class PopulatingNextRightPointerInEachNode {
    Node1 root;

    public void levelPoint(Node1 root) {
        if (root == null) {
            return;
        }

        // Start with the first level
        Node1 levelStart = root;

        while (levelStart != null) {
            Node1 current = levelStart;

            // Initialize the next level start node
            Node1 nextLevelStart = null;
            Node1 prev = null;

            while (current != null) {
                if (current.left != null) {
                    if (prev != null) {
                        prev.next = current.left;
                    } else {
                        nextLevelStart = current.left;
                    }
                    prev = current.left;
                }

                if (current.right != null) {
                    if (prev != null) {
                        prev.next = current.right;
                    } else {
                        nextLevelStart = current.right;
                    }
                    prev = current.right;
                }

                current = current.next;
            }

            // Move to the next level
            levelStart = nextLevelStart;
        }

        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node1 root) {
        if (root == null) {
            return;
        }
        preOrderTraversal(root.left);
        if (root.next != null) {
            System.out.println(root.val + " -> " + root.next.val);
        } else {
            System.out.println(root.val + " -> null");
        }
        preOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        PopulatingNextRightPointerInEachNode tree = new PopulatingNextRightPointerInEachNode();
        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);
        tree.root.right.left = new Node1(6);
        tree.root.right.right = new Node1(7);
        tree.levelPoint(tree.root);
    }
}
