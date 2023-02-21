package Sem3;

import java.util.Arrays;
import java.util.Iterator;

public class LinkList implements Iterable<Integer> {
    private Node head;
    private Node last;
    private Node[] chain = new Node[11];
    private int size = 0;

    private boolean checkIndex(int index) {
        return (index <= 0 && index >= size);
    }

    public void addElement(int value) {
        Node newNode = new Node(value);
        Node temp = last;
        last = newNode;
        if (head == null) {
            head = newNode;
        } else {
            temp.next = newNode;
            newNode.previous = temp;
        }
        chain[size++] = newNode;
        checkLength();
    }

    private void checkLength() {
        if (size == chain.length / 2) {
           chain = Arrays.copyOf(chain, chain.length + 11);
        }
    }

    public int getElement(int index) {
       if (checkIndex(index)) {
          return -1;
       }
       return chain[index].value;
    }

    public boolean deleteElement(int index) {
        for (int i = 0; i < size; i++) {
            if (i == index) {
                Node nextElement = chain[i].next;
                Node prevElement = chain[i].previous;
                nextElement.previous = prevElement;
                prevElement.next = nextElement;
                int newSize = chain.length - 1;
                System.arraycopy(chain, i + 1, chain, i, newSize - i);
                chain[newSize] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public boolean showPrevAndNext(int index) {
        for (int i = 0; i <= size; i++) {
            if (i == index) {
                System.out.printf("Element - %s, previous - %s, next - %s\n", chain[i].value, chain[i].previous, chain[i].next);
                return true;
            }
        }
        return false;

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int count = 0;

            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public Integer next() {
                return chain[count++].value;
            }
        };
    }

    private class Node {
        private Node next;
        private Node previous;
        private int value;

        private Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
