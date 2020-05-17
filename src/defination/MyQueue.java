package defination;

import adt.QueueADT;

public class MyQueue<E> implements QueueADT<E> {
    private Node<E> front = null;
    private Node<E> rear = null;

    @Override
    public boolean offer(Object item) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E peek() {
        return null;
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
