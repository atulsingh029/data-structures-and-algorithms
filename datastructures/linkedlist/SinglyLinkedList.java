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

    /* This method inserts a Node at the end of the singly linked list */
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

    /* This method inserts a Node at the start of the singly linked list */
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

    /* This method returns True if linked list is empty else returns False */
    public boolean  isEmpty(){
        if(head == null){
            return true;
        }
        else return false;
    }

    /* This method searches through the linked list and returns first Node that matches the data of Node with provided data */
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

    /* This method removes the head and makes head.next the head and returns the removed head's data */
    public int pop_from_beginning(){
        Node poper = head;
        head = poper.next;
        return (Integer) poper.data;
    }

    /* This method returns the length of the linked list*/
    public int length(){
        int count = 0;
        Node counter = head;
        if (counter == null){
            return 0;
        }
        while (counter.next != null){
            counter = counter.next;
            count = count+1;
        }
        return count+1;
    }

    /* This method removes the first occurrence of Node with provided data */
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

    /* Prints the linked list on console */
    public void view(){
        Node iterator = head;
        if (head == null)
            return;
        while (iterator.next != null){
            System.out.print(iterator.data + " -> ");
            iterator = iterator.next;
        }
        System.out.println(iterator.data);
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        System.out.println("isempty "+singlyLinkedList.isEmpty());
        singlyLinkedList.insertAtEnd(5);
        singlyLinkedList.insertAtEnd(20);
        singlyLinkedList.insertAtEnd(-50);
        singlyLinkedList.view();
    }
}
