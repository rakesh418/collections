import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("rakesh");
        linkedList.add("dutta");
        linkedList.add("dutta1");
        linkedList.add("dutta2");
        linkedList.add("dutta3");
        linkedList.add("dutta2");
        System.out.println(linkedList);

        ListIterator<String> listIterator = linkedList.listIterator();
        while(listIterator.hasNext())
            System.out.println(listIterator.next());
        System.out.println("*******");
        while(listIterator.hasPrevious())
            System.out.println(listIterator.previous());
    }
}
 