package sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkList implements Iterable<LinkList.Node> {
    private List<Node> chain = new ArrayList<>();
    private int size;

    private boolean checkIndex(int index) {
        return (index <= 0 && index >= size);
    }

    public void addElement(int value) {
        Node newNode = new Node(value);
        if (chain.isEmpty()) {
            chain.add(newNode);
        } else {
            Node lastInChain = chain.get(chain.size() - 1);
            lastInChain.next = newNode;
            newNode.previous = lastInChain;
            chain.add(newNode);
        }
        size++;
    }

    public int getElement(int index) {
       if (checkIndex(index)) {
          return -1;
       }
       return chain.get(index).getValue();
    }

    public boolean deleteElement(int index) {
        if (checkIndex(index)) {
            return false;
        }
        Node elementToDelete = chain.get(index);
        Node prevElement = elementToDelete.previous;
        Node nextElement = elementToDelete.next;
        if (prevElement != null) {
            prevElement.next = nextElement;
        }
        if (nextElement != null) {
            nextElement.previous = prevElement;
        }
        chain.remove(elementToDelete);
        size--;
        return true;
    }

    public int getSize() {
        return size;
    }

    public boolean showPrevAndNext(int index) {
        if (checkIndex(index)) {
            return false;
        }
        Node elementToShow = chain.get(index);
        System.out.printf("Element - %s, previous - %s, next - %s\n", elementToShow, elementToShow.previous, elementToShow.next);
        return true;
    }

    @Override
    public Iterator<Node> iterator() {
        return new Iterator<>() {
            int count = 0;

            @Override
            public boolean hasNext() {
                return count < chain.size();
            }

            @Override
            public Node next() {
                return chain.get(count++);
            }
        };
    }

    protected static class Node {
        Node next;
        Node previous;
        int value;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public int getValue() {
            return value;
        }
    }
}
