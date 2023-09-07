class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList<T> {
    private LinkedListNode<T> head;

    public LinkedList() {
        head = null;
    }

    public void add(T data) {
        LinkedListNode<T> newNode = new LinkedListNode<>(data);
        if (head == null) {
            head = newNode;
        } else {
            LinkedListNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void print() {
        LinkedListNode<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        LinkedList<String> mylist = new LinkedList<>();
        mylist.add("Mayur");
        mylist.add("Second");
        mylist.print();
    }
}
