package Lesson4;

public class MyLinkedQueue<T> {
    private MyLinkedList<T> stack = new MyLinkedList<>();

    public void insert(T item) {
        stack.insertLast(item);
    }

    public T remove() {
       return stack.deleteFirst();
    }

    public T peek() {
       return stack.getFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
