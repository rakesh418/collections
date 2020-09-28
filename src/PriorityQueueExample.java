import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

//class Book implements Comparable<Book>{
//    int id;
//    String name,author,publisher;
//    int quantity;
//
//    public Book(int id, String name, String author, String publisher, int quantity) {
//        this.id = id;
//        this.name = name;
//        this.author = author;
//        this.publisher = publisher;
//        this.quantity = quantity;
//    }
//
//    @Override
//    public int compareTo(Book b) {
//        if(id>b.id)
//            return 1;
//        else if(id<b.id)
//            return -1;
//        else
//            return 0;
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                ", publisher='" + publisher + '\'' +
//                ", quantity=" + quantity +
//                '}';
//    }
//}

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Book> queue = new PriorityQueue<>();
        queue.add(new Book(121,"Let us C","Yashwant Kanetkar","BPB",8));
        queue.add(new Book(233,"Operating System","Galvin","Wiley",6));
        queue.add(new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4));
        queue.add(new Book(199,"Data Communications & Networking","Forouzan","Mc Graw Hill",4));
        queue.add(new Book(141,"Data Communications & Networking","Forouzan","Mc Graw Hill",4));
        queue.add(new Book(201,"Data Communications & Networking","Forouzan","Mc Graw Hill",4));
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }

}
