package lesson_3;

import static lesson_3.SearchElement.search;

public class Main {

    public static void main(String[] args) {
        //Part 1 (SearchElement)
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9};
        System.out.println("Пропущено: " + search(arr));

        //Part 2 (Deque)
        Deque<Integer> deq = new DequeImpl<>(6);

        insertRight(deq, 1);
        insertRight(deq, 2);
        insertRight(deq, 3);
        insertRight(deq, 4);
        insertLeft(deq, 5);
        insertLeft(deq, 6);

        removeLeft(deq);
        removeRight(deq);

        displayLeftToRight(deq);
        displayRightToLeft(deq);
    }

    private static <E> void insertRight(Deque<E> deq, E value) {
        if ( !deq.isFull() ) {
            deq.insertRight(value);
        }
    }

    private static <E> void insertLeft(Deque<E> deq, E value) {
        if ( !deq.isFull() ) {
            deq.insertLeft(value);
        }
    }

    private static <E> void removeRight(Deque<E> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeRight();
        }
    }

    private static <E> void removeLeft(Deque<E> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeLeft();
        }
    }

    private static <E> void displayRightToLeft(Deque<E> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeRight());
        }
    }

    private static <E> void displayLeftToRight(Deque<E> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeLeft());
        }
    }

}
