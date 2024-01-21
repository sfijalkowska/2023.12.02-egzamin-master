package pl.camp.it.egzamin.zadanie2;

public class BinaryTree {
    private Node root = null;

    public void add(int value) {
        if(this.root == null) {
            this.root = new Node(value);
        } else {
            add(this.root, value);
        }
    }

    private void add(Node node, int value) {
        if(node.getValue() > value) {
            if(node.getLeft() == null) {
                node.setLeft(new Node(value));
            } else {
                add(node.getLeft(), value);
            }
        } else {
            if(node.getRight() == null) {
                node.setRight(new Node(value));
            } else {
                add(node.getRight(), value);
            }
        }
    }

    public boolean contains(int value) {
        return contains(this.root, value);
    }

    private boolean contains(Node node, int value) {
        if(node == null) {
            return false;
        } else if (node.getValue() == value) {
            return true;
        } else {
            if(node.getValue() > value) {
                return contains(node.getLeft(), value);
            } else {
                return contains(node.getRight(), value);
            }
        }
    }

    public int min() {
        return min(this.root);
    }

    private int min(Node node) {
        if(node.getLeft() == null) {
            return node.getValue();
        }
        return min(node.getLeft());
    }

    public int max() {
        return max(this.root);
    }

    private int max(Node node) {
        if(node.getRight() == null) {
            return node.getValue();
        }
        return max(node.getRight());
    }

    public int maxNoR() {
        Node node = this.root;
        while (node.getRight() != null) {
            node = node.getRight();
        }
        return node.getValue();
    }
}
