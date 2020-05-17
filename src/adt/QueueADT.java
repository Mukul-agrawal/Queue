package adt;

public interface QueueADT<E> {
    boolean offer(E item);

    E remove();

    E peek();

    E poll();

    E element();
}
