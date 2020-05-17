package defination;

import adt.QueueADT;

public class MyQueue<E> implements QueueADT {
    @Override
    public boolean offer(Object item) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }

    private static class Node<E> {
        public E getData() {
            return data;
        }

        private E data;

        public Node<E> getNext() {
            return next;
        }

        private Node<E> next;


    }
}
