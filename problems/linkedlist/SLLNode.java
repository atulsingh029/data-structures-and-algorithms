package problems.linkedlist;

public class SLLNode<T> {
    private T data;
    private SLLNode next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public SLLNode getNext() {
        return next;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }
}
