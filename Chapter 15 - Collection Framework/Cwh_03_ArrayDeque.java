import java.util.ArrayDeque;

public class Cwh_03_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        // Deque is double ended queue in which insertion and deletion takes place at both ends of the queue
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);

        ad1.offerFirst(8);
        // the difference between add and offer is that add may throw exception but offer will not
        // same is for : remove() and poll()
        // and get() and peek()
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

        // we can directly print an ArrayDeque without any loops 
        System.out.println(ad1); // will print in the form of a list
        
        
    }
}
