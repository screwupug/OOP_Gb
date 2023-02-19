package sem3;

import java.util.List;

public class Test {
    public static void main(String[] args) {
       LinkList list = new LinkList();
       list.addElement(1);
       list.addElement(2);
       list.addElement(3);
       list.addElement(4);
       list.addElement(5);

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.showPrevAndNext(i));
        }
        list.deleteElement(2);
        System.out.println("------------------------------------------");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.showPrevAndNext(i));
        }
        System.out.println("------------------------------------------");
        System.out.println(list.getElement(1));
        System.out.println("------------------------------------------");
        for (LinkList.Node node : list) {
            System.out.println(node);
        }

    }
}
