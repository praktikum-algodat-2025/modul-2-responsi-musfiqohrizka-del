public class StackBuku {
    private Node top;

    public void push(String data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public void pop() {
        if (top != null) {
            top = top.next;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void tampilkanBuku() {
        Node current = top;
        while (current != null) {
            System.out.println(" - " + current.data);
            current = current.next;
        }
    }
}
