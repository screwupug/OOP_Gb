package sem3;
public class Test {
    public static void main(String[] args) {
      LinkList list = new LinkList();
        for (int i = 0; i < 100; i++) {
            list.addElement(i);
        }
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.showPrevAndNext(i));
        }
        list.deleteElement(22);
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.showPrevAndNext(i));
        }
    }
}
