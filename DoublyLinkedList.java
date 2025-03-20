public class DoublyLinkedList<T> {
    private List<T> head, tail;

    public void addLast(T data) {
        List<T> newList = new List<>(data);
        if (tail == null) {
            head = tail = newList;
        } else {
            tail.next = newList;
            newList.prev = tail;
            tail = newList;
        }
    }

    public void addFirst(T data) {
        List<T> newNode = new List<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void printForward() {
        List<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void removeFirst() {
        if (head == null) return;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;
    }

    public void removeLast() {
        if (tail == null) return;
        tail = tail.prev;
        if (tail != null) tail.next = null;
        else head = null;
    }

    public T get(int index) {
        List<T> temp = head;
        for (int i = 0; temp != null && i < index; i++) {
            temp = temp.next;
        }
        return (temp != null) ? temp.data : null;
    }
}
