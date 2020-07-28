package lesson3;

import java.util.EmptyStackException;

public class MyDeque<T> {
    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int begin = 0;
    private int end = 1;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insertLeft(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        list[begin] = item;
        begin = revIndex(begin);
        size++;
    }

    public T popLeft() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
         T item = list[nextIndex(begin)];
        list[nextIndex(begin)] = null;
        begin = nextIndex(begin);
        size--;
        return item;
    }

    public void insertRight(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        list[end] = item;
        end = nextIndex(end);
        size++;
    }

    public T popRight() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = list[revIndex(end)];
        list[revIndex(end)] = null;
        end = revIndex(end);
        size--;
        return item;
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int revIndex(int index) {
        if(index == 0) {
            index = list.length-1;
        } else {
            index = (index - 1) % list.length;
        }

        return index;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (!isEmpty()) {
            int i = begin;
            while (i != end) {
                sb.append(list[i]).append(", ");
                i = nextIndex(i);
            }
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
