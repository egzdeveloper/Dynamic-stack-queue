public class Node {
    private Integer value;
    private Node next;

    public void Node() {
        this.value = 0;
        this.next = null;
    }


    // Getters and Setters
    public Integer getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
