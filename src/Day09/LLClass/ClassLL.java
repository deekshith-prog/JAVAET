package Day09.LLClass;

public class ClassLL {
    private Node head;
    private Node tail;
    private int size;

    void addFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    void addLast(int value) {
        if (tail == null) {
            addFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    void insert(int index, int value) {
        if (index == 0) {
            addFirst(value);
            return;
        }
        if (index == size) {
            addLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    int deleteFirst() {
        if (size == 0) {
            return -1;
        }
        int val = head.value;
        head = head.next;
        size--;
        return val;
    }
    int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        int val=tail.value;
        Node secondLast=get(size-2);
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }
    int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev= get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
    }

    Node get(int index){
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }

        System.out.println(" \nEnd");
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

        public static void main(String[] args) {
            ClassLL ll=new ClassLL();
            ll.addFirst(1);
            ll.addFirst(2);
            ll.addFirst(3);
            ll.addFirst(4);
            ll.addFirst(5);
            ll.display();
            ll.addLast(6);
            ll.addLast(7);
            ll.display();
            ll.deleteFirst();
            ll.display();
            ll.deleteLast();
            ll.display();
            ll.delete(2);
            ll.display();
        }
    }
