package algorithms.binarytreepractise;

public class Tree {

    private Node node;

    public void insert(int key) {
        Node node = new Node();
        node.setKey(key);
        if (this.node == null) {
            this.node = node;
        } else {
            Node current = this.node;
            Node prev;
            while (true) {
                prev = current;
                if (key < current.getKey()) {
                    if ((current = current.getLeftChild()) == null) {
                        prev.setLeftChild(node);
                        return;
                    }
                } else {
                    if ((current = current.getRightChild()) == null) {
                        prev.setRightChild(node);
                        return;
                    }

                }
            }
        }
    }

    @Override
    public String toString() {
        return node.toString();
    }
}
