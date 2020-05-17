package defination;

import adt.QueueADT;

import java.util.NoSuchElementException;

public class MyQueue<E> implements QueueADT<E> {
    private Node<E> front = null;
    private Node<E> rear = null;
    private int size = 0;

    @Override
    public boolean offer(E item) {
        if (front == null) {
            rear = new Node<>(item);
            front = rear;
        } else {
            rear.next = new Node<>(item);
            rear = rear.next;
        }
        size++;
        return true;
    }

    @Override
    public E remove() {
        E item = peek();
        if (item == null)
            throw new NoSuchElementException();
        else
            front = front.next;
        size--;
        return item;
    }

    @Override
    public E peek() {
        if (size == 0)
            return null;
        else
            return front.data;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }


    }
}
