package datastructures.linkedlist;

public class SinglyLinkedList<T> {
    private class Node<T>{
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public T insertAtEnd(T data){
        Node node = new Node(data);
        Node iterator=head;
        if(head==null){
           head=node;
        }
        else {
            while (iterator.next != null){
                iterator = iterator.next;
            }
            iterator.next=node;
        }
        return data;
    }

    public T insertAtBeginning(T data){
        Node node = new Node(data);
        if(head==null){
            head=node;
        }
        else {
            Node temp=head;
            head = node;
            head.next = temp;
        }
        return data;
    }

    public boolean  isEmpty(){
        if(head == null){
            return true;
        }
        else return false;
    }

    public boolean search(T data){
        Node iterator = head;
        while (iterator.next != null){
            if (iterator.data == data){
                return true;
            }
            iterator = iterator.next;
        }
        return false;
    }

    public T remove(T data){
        Node iterator = head;
        T response;
        if (head.data == data && head != null){
            response = (T) head.data;
            head=head.next;
            return response;
        }
        else {
            Node parent = null;
            while (iterator.data != data && iterator.next != null) {
                parent = iterator;
                iterator = iterator.next;
            }
            parent.next = iterator.next;
            response=(T)iterator.data;
            if(response != data){
                return null;
            }
        }
        return response;
    }

    public void view(){
        Node iterator = head;
        while (iterator.next != null){
            System.out.print(iterator.data + " ");
            iterator = iterator.next;
        }
        System.out.println(iterator.data);
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        System.out.println("isempty"+singlyLinkedList.isEmpty());
        singlyLinkedList.insertAtEnd(50);
        singlyLinkedList.insertAtEnd(20);
        singlyLinkedList.insertAtEnd(-50);
        System.out.println("5 "+singlyLinkedList.search(5));
        System.out.println("20 "+singlyLinkedList.search(20));
        singlyLinkedList.insertAtEnd(1110);
        singlyLinkedList.view();
        singlyLinkedList.insertAtBeginning(2);
        System.out.println("2 "+singlyLinkedList.search(2));
        singlyLinkedList.insertAtBeginning(3);
        System.out.println("5000 "+singlyLinkedList.search(5000));
        singlyLinkedList.view();
        System.out.println("isempty"+singlyLinkedList.isEmpty());
        System.out.println("removing 50 " + singlyLinkedList.remove(50));
        singlyLinkedList.view();
        System.out.println("removing 3 "+ singlyLinkedList.remove(3));
        singlyLinkedList.view();
        System.out.println("removing 1110 "+singlyLinkedList.remove(1110));
        singlyLinkedList.view();
        System.out.println(singlyLinkedList.remove(56));
        System.out.println(singlyLinkedList.remove(966));
    }
}
