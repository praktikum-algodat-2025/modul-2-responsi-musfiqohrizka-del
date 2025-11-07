public class QueuePelanggan {
    private QueueNode front, rear;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Pelanggan p) {
        QueueNode newNode = new QueueNode(p);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public Pelanggan dequeue() {
        if (isEmpty()) return null;
        Pelanggan p = front.data;
        front = front.next;
        if (front == null) rear = null;
        return p;
    }

    public Pelanggan peek() {
        if (isEmpty()) return null;
        return front.data;
    }

    void tampilkanAntrian() {
    if (isEmpty()) return;

    QueueNode temp = front;
    int nomor = 1;
    while (temp != null) {
        System.out.println("Pelanggan ke-" + nomor);
        temp.data.stackBuku.tampilkanBuku();
        temp = temp.next;
        nomor++;
    }
}

}
