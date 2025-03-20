public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.addLast(4);
        list.addLast(6);
        list.addLast(8);
        list.printForward();

        list.addFirst(2);
        list.printForward();

        list.removeFirst();
        list.printForward();

        list.removeLast();
        list.printForward();

        System.out.println(list.get(0));
    }

}
